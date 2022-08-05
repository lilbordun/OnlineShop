package enums;

public enum CategoryOfShoes {
    HEELS("heels"),
    FLATS("flats"),
    BOOTS("boots"),
    SNEAKERS("sneakers"),
    SANDALS("sandals");

    private String value;
    CategoryOfShoes(String value){
        this.value = value;

    }

    public String getValue(){
        return value;
    }
    }

