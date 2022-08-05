package enums;

public enum TypeOfDiscount {
    BIRTHDAY("birthday"),
    CUMULATIVEOVER1000("cumulativeover1000"),
    CUMULATIVEOVER5000("cumulativeover5000"),
    CUMULATIVEOVER10000("cumulativeover10000");

    private String value;
    TypeOfDiscount (String value){
        this.value = value;

    }

    public String getValue(){
        return value;
    }
    }

