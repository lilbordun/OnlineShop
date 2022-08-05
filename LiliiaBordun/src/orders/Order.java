package orders;

import roles.Client;

public class Order extends CustomerBag {
    private int id;
    private String dateOfCreation;
    private Client name;
    private Client address;
    private Client emailAddress;
    private Client phoneNumber;
      private double summaryOfOrder;

    Order(){}

    Order(int id, String dateOfCreation, Client name, Client address, Client emailaddress,
          Client phonenumber, double summaryOfOrder){
        this.id = id;
        this.dateOfCreation = dateOfCreation;
        this.name = name;
        this.address = address;
        this.emailAddress = emailaddress;
        this.phoneNumber = phonenumber;
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

    public Client getName() {
        return name;
    }

    public void setName(Client name) {
        this.name = name;
    }

    public Client getAddress() {
        return address;
    }

    public void setAddress(Client address) {
        this.address = address;
    }

    public Client getEmailaddress() {
        return emailAddress;
    }

    public void setEmailaddress(Client emailaddress) {
        this.emailAddress = emailaddress;
    }

    public Client getPhonenumber() {
        return phoneNumber;
    }

    public void setPhonenumber(Client phonenumber) {
        this.phoneNumber = phonenumber;
    }

    public double getSummaryOfOrder() {
        return summaryOfOrder;
    }

    public void setSummaryOfOrder(double summaryOfOrder) {
        this.summaryOfOrder = summaryOfOrder;
    }
}
