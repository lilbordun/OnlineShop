package enums;

public enum CategoryOfClothes {
    TSHIRTS("tshirts"),
    BLOUSES("blouses"),
    TOPS("tops"),
    JACKETS("jackets"),
    COATS("coats"),
    SWEATERS("sweaters"),
    SWEATSHIRTS("sweatshirts"),
    TROUSERS("trousers"),
    JEANS("jeans"),
    SHORTS("shorts"),
    SKIRTS("skirts"),
    LINGERIE("lingerie");

    private String value;
    CategoryOfClothes (String value){
        this.value = value;

    }

    public String getValue(){
        return value;
    }
}
