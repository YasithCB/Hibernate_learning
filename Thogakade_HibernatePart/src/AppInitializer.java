import lk.thogakade.hibernatePart.entity.Customer;
import lk.thogakade.hibernatePart.entity.Item;
import lk.thogakade.hibernatePart.entity.OrderDetail;
import lk.thogakade.hibernatePart.entity.Orders;
import lk.thogakade.hibernatePart.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {

    public static void main(String[] args) {

        Customer customer1 = new Customer("C001", "Amali", "1245124512", "Colombo");
        Customer customer2 = new Customer("C002", "Nimal", "3225121232", "Galle");
        Customer customer3 = new Customer("C003", "Siripala", "8845121232", "Panadura");
        Customer customer4 = new Customer("C004", "Anjana", "9245121232", "Ratnapura");

        Item item1 = new Item("I001","Ball",250,20);
        Item item2 = new Item("I002","Cap",190,200);
        Item item3 = new Item("I003","Monitor",6500,30);
        Item item4 = new Item("I004","Mouse",1200,50);

        Orders order1 = new Orders("O001",customer1);
        Orders order2 = new Orders("O002",customer2);
        Orders order3 = new Orders("O003",customer3);

        OrderDetail orderDetail1 = new OrderDetail(order1,item1,10);
        OrderDetail orderDetail2 = new OrderDetail(order2,item2,50);
        OrderDetail orderDetail3 = new OrderDetail(order1,item3,12);
        OrderDetail orderDetail4 = new OrderDetail(order3,item1,6);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // add
        /*session.save(customer1);
        session.save(customer2);
        session.save(customer3);
        session.save(customer4);

        session.save(item1);
        session.save(item2);
        session.save(item3);
        session.save(item4);

        session.save(order1);
        session.save(order2);
        session.save(order3);

        session.save(orderDetail1);
        session.save(orderDetail2);
        session.save(orderDetail3);
        session.save(orderDetail4);*/ // these are saved

        // update
        customer1.setCity("Anuradhapura");
        session.update(customer1);

        // select
        Customer c001 = session.get(Customer.class, "C004");
        System.out.println(c001);

        // delete
        /*Customer customer = new Customer();
        customer.setcId("C004");
        session.delete(customer);*/
        Object persistentInstance = session.load(Customer.class, "C004");
        if (persistentInstance != null) {
            session.delete(persistentInstance);
        }


        transaction.commit();
        session.close();

    }

}
