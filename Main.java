import java.util.ArrayList;


public class Main {
    //Create objects, compare and print
    public static void main(String[] args) {

    Customer cust1 = new Customer("Omar", "Flayan", "93874672");
    cust1.setShippingAddress("Main St", "Chicago", "IL", "60602");
    cust1.setBillingAddress("Main St", "Chicago", "IL", "60602");
    Customer cust2 = new Customer("Omar2", "Flayan2", "93874672sss");
    cust2.setShippingAddress("Main St2", "SJ", "CA", "30920");
    cust2.setBillingAddress("Main St2", "SJ", "CA", "30920");
    Customer cust3 = new Customer("Omar3", "Flayan3", "93874672ttt");
    cust3.setShippingAddress("Main St3", "FairField", "IA", "52556");
    cust3.setBillingAddress("Main St3", "FairField", "IA", "52556");
    Customer cust4 = new Customer("Omar2nd", "Flayan", "93874671");
    cust4.setShippingAddress("Main St", "Chicago", "IL", "60602");
    cust4.setBillingAddress("Main St", "Chicago", "IL", "60602");

    ArrayList <Customer> e = new ArrayList<Customer>();
    e.add(cust1);
    e.add(cust2);
    e.add(cust3);
    e.add(cust4);

    for (int i =0; i<e.size();i++){
        if (e.get(i).getBillingAddress().getCity() == "Chicago"){
            System.out.println(e.get(i).toString());
        }
    }
    }
}