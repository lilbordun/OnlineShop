package enums;

public enum PaymentMethod {
    PAYPAL("paypal"),
    USINGCREDIDCARD("USINGCREDIDCARD"),
    APPLEPAY("applepay"),
    GOOGLEPAY("googlepay");

private String value;
 PaymentMethod(String value){
     this.value = value;
 }
 public  String getValue(){
 return value;}

}
