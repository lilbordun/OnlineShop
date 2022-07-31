package goods;

 public class Shoes extends Items{
    private String nameOfShoes;
    private String sexCategoryOfShoes;;//can be enum
    private String categoryOfShoes;
    private String seasonOfShoes;//can be enum
    private String colorOfShoes;
    private String material;
    private int yearMonthOfCollectionShoes;

    Shoes (){}

    Shoes(String nameOfShoes, String categoryOfShoes, String colorOfShoes,
          String material, int yearMonthOfCollectionShoes){
       this.nameOfShoes = nameOfShoes;
       this.categoryOfShoes = categoryOfShoes;
       this.colorOfShoes = colorOfShoes;
       this.material = material;
       this.yearMonthOfCollectionShoes= yearMonthOfCollectionShoes;
    }

    public String getNameOfShoes() {
       return nameOfShoes;
    }

    public void setNameOfShoes(String nameOfShoes) {
       this.nameOfShoes = nameOfShoes;
    }

    public String getSexCategoryOfShoes() {
       return sexCategoryOfShoes;
    }

    public void setSexCategoryOfShoes(String sexCategoryOfShoes) {
       this.sexCategoryOfShoes = sexCategoryOfShoes;
    }

    public String getCategoryOfShoes() {
       return categoryOfShoes;
    }

    public void setCategoryOfShoes(String categoryOfShoes) {
       this.categoryOfShoes = categoryOfShoes;
    }

    public String getSeasonOfShoes() {
       return seasonOfShoes;
    }

    public void setSeasonOfShoes(String seasonOfShoes) {
       this.seasonOfShoes = seasonOfShoes;
    }

    public String getColorOfShoes() {
       return colorOfShoes;
    }

    public void setColorOfShoes(String colorOfShoes) {
       this.colorOfShoes = colorOfShoes;
    }

    public String getMaterial() {
       return material;
    }

    public void setMaterial(String material) {
       this.material = material;
    }

    public int getYearMonthOfCollectionShoes() {
       return yearMonthOfCollectionShoes;
    }

    public void setYearMonthOfCollectionShoes(int yearMonthOfCollectionShoes) {
       this.yearMonthOfCollectionShoes = yearMonthOfCollectionShoes;
    }
 }


