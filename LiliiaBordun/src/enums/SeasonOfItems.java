package enums;

public enum SeasonOfItems {
    WINTER("winter"),
    SPRING("spring"),
    SUMMER("summer"),
    AUTUMN("autumn");

    private String value;
    SeasonOfItems (String value){
        this.value = value;

    }

    public String getValue(){
        return value;
    }
    }

