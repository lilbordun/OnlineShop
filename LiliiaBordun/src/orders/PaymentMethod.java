package orders;

public class PaymentMethod {
    private String typeOfCreditCard;
    private String nameOfBank;
    private String currency;

    PaymentMethod(){}

    PaymentMethod(String  typeOfCreditCard, String nameOfBank, String currency){
        this.typeOfCreditCard = typeOfCreditCard;
        this.nameOfBank = nameOfBank;
        this.currency = currency;
    }

    public String getTypeOfCreditCard() {
        return typeOfCreditCard;
    }

    public void setTypeOfCreditCard(String typeOfCreditCard) {
        this.typeOfCreditCard = typeOfCreditCard;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
