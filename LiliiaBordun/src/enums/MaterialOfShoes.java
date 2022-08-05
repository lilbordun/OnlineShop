package enums;

public enum MaterialOfShoes {
    LEATHER("leather"),
    ECOLEATHER("ecoleather"),
    EVA("eva");

    private String value;
    MaterialOfShoes (String value){
        this.value = value;

    }

    public String getValue(){
        return value;
    }
    }

