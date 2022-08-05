package enums;

public enum FabricOfClothes {
    LIEN("lien"),
    COTTON("cotton"),
    ELASTANE("elastane"),
    FUR("fur"),
    DIVING("diving");

    private String value;
    FabricOfClothes (String value){
        this.value = value;

    }

    public String getValue(){
        return value;
    }
    }

