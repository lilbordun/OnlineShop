package enums;

public enum TypeOfAccess {
    CLIENTACCESS("useraccess"),
    ADMINACCESS("adminaccess");

    private String value;

    TypeOfAccess(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
