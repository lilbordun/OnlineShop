package enums;

public enum SexCategory {
    MALE("male"),
    FEMALE("female"),
    GIRLS("girls"),
    BOYS("boys");

    private String value;
    SexCategory (String value){
        this.value = value;

    }

    public String getValue(){
        return value;
    }
    }


