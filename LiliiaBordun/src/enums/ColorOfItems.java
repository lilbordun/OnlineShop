package enums;

public enum ColorOfItems {
    BLACK("black"),
    WHITE("white"),
    IVORY("ivory"),
    BEIGE("beige"),
    GREY("grey"),
    SILVER("silver"),
    RED("red"),
    CORAL("coral"),
    PINK("pink"),
    MAGENTA("magenta"),
    MAROON("maroon"),
    YELLOW("yellow"),
    AMBER("amber"),
    ORANGE("orange"),
    GOLD("gold"),
    GREEN("green"),
    MINT("mint"),
    KHAKI("Khaki"),
    BLUE("blue"),
    NAVYBLUE("navyblue"),
    VIOLET("violet"),
    PURPLE("purple");
private   String value ;
ColorOfItems(String value){
    this.value = value;
}
public String getValue(){
    return value;
}


}
