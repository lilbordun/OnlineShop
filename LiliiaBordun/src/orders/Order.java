package orders;

import orders.CustomerBag;
import roles.Customer;

public class Order extends CustomerBag {
    private int id;
    private String dateOfCreation;
    private Customer name;
    private Customer address;
    private Customer emailaddress;
    private Customer phonenumber;
    private String paymentMethod;
    private double summaryOfOrder;

    Order(){}

    Order(int id, String dateOfCreation, Customer name, Customer address, Customer emailaddress,
          Customer phonenumber, String paymentMethod, double summaryOfOrder){
        this.id = id;
        this.dateOfCreation = dateOfCreation;
        this.name = name;
        this.address = address;
        this.emailaddress = emailaddress;
        this.phonenumber = phonenumber;
        this.paymentMethod = paymentMethod;
        this.summaryOfOrder = summaryOfOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Customer getName() {
        return name;
    }

    public void setName(Customer name) {
        this.name = name;
    }

    public Customer getAddress() {
        return address;
    }

    public void setAddress(Customer address) {
        this.address = address;
    }

    public Customer getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(Customer emailaddress) {
        this.emailaddress = emailaddress;
    }

    public Customer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Customer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getSummaryOfOrder() {
        return summaryOfOrder;
    }

    public void setSummaryOfOrder(double summaryOfOrder) {
        this.summaryOfOrder = summaryOfOrder;
    }
}
