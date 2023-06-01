public class Customer {
    //Declare class fields
    private String firstName;
    private String lastName;
    private String socSecurityNum;

    private Address shippingAddress;
    private Address billingAddress;

    //Constructor
    Customer(String firstName, String lastName, String socSecurityNum){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socSecurityNum=socSecurityNum;
    }

    //Setters, getters and toString override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public void setShippingAddress(String street, String city, String state, String zip) {
        Address adrs = new Address(street,city,state,zip );
        this.shippingAddress = adrs;
    }

    public void setBillingAddress(String street, String city, String state, String zip) {
        Address adrs = new Address(street,city,state,zip );
        this.billingAddress = adrs;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }


}
