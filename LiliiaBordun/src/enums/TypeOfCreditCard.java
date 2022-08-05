package enums;

public enum TypeOfCreditCard {
    VISA("visa"),
    MASTERCARD("mastercard"),
    MAESTRO("maestro");

    private String value;

    TypeOfCreditCard(String value){
        this.value = value;
    }
    public String getValue(){
        return  value;
    }
}
