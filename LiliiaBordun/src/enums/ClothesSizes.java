package enums;

public enum ClothesSizes {
    XS("xs"),
    S("s"),
    M("m"),
    L("l"),
    XL("xl");

    private String value;

      ClothesSizes(String value){
        this.value = value;
    }
    public String getValue(){
          return value;
    }
}
