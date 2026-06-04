import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {

        ArrayList<customer> customers = new ArrayList<>(2);

        customer c1 = new customer(1, "Andi");
        customer c2 = new customer(2, "Budi");
        customer c3 = new customer(3, "Citra");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        customers.add(1, new customer(4, "Dina"));

        for (customer c : customers) {
            System.out.println(c);
        }

        System.out.println("Index Dina : " + customers.indexOf(customers.get(1)));
        System.out.println("Data index 2 : " + customers.get(2));

        System.out.println(customers);
    }
}