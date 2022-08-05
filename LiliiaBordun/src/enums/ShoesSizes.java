package enums;

public enum ShoesSizes {
     SIZE5("5.0"),
    5.5("5.5"),
    6.0("6.0"),
    6.5("6.5"),
    7.0("7.0"),
    7.5("7.5"),
    8.0("8.0"),
    8.5("8.5"),
    9.0("9.0"),
    9.5("9.5");

    private String value;

    ShoesSizes(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
