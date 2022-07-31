package goods;

abstract  class Discount {
    private String nameOfDiscount;
    private String typeOfDiscount;//can be enum in future
    private double sizeOfDiscount;

    Discount(){}

    Discount(String nameOfDiscount, String typeOfDiscount, double sizeOfDiscount){
        this.nameOfDiscount = nameOfDiscount;
        this.typeOfDiscount = typeOfDiscount;
        this.sizeOfDiscount = sizeOfDiscount;
    }

    public String getNameOfDiscount() {
        return nameOfDiscount;
    }

    public void setNameOfDiscount(String nameOfDiscount) {
        this.nameOfDiscount = nameOfDiscount;
    }

    public String getTypeOfDiscount() {
        return typeOfDiscount;
    }

    public void setTypeOfDiscount(String typeOfDiscount) {
        this.typeOfDiscount = typeOfDiscount;
    }

    public double getSizeOfDiscount() {
        return sizeOfDiscount;
    }

    public void setSizeOfDiscount(double sizeOfDiscount) {
        this.sizeOfDiscount = sizeOfDiscount;
    }
}
