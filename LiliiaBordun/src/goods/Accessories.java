package goods;

 public class Accessories extends Items {
    private String nameOfAccessories;
    private String sexCategoryOfAccessories;//can be enum
    private String categoryOfAccessories;
    private String seasonOfAccessories;//can be enum
    private String colorOfAccessories;
        private int yearMonthOfCollectionClothes;

    Accessories (){}

    Accessories(String nameOfAccessories, String categoryOfAccessories,
                String colorOfAccessories, int yearMonthOfCollectionClothes){
       this.nameOfAccessories = nameOfAccessories;
       this.categoryOfAccessories = categoryOfAccessories;
       this.colorOfAccessories = colorOfAccessories;
       this.yearMonthOfCollectionClothes = yearMonthOfCollectionClothes;
    }

    public String getNameOfAccessories() {
       return nameOfAccessories;
    }

    public void setNameOfAccessories(String nameOfAccessories) {
       this.nameOfAccessories = nameOfAccessories;
    }

    public String getSexCategoryOfAccessories() {
       return sexCategoryOfAccessories;
    }

    public void setSexCategoryOfAccessories(String sexCategoryOfAccessories) {
       this.sexCategoryOfAccessories = sexCategoryOfAccessories;
    }

    public String getCategoryOfAccessories() {
       return categoryOfAccessories;
    }

    public void setCategoryOfAccessories(String categoryOfAccessories) {
       this.categoryOfAccessories = categoryOfAccessories;
    }

    public String getSeasonOfAccessories() {
       return seasonOfAccessories;
    }

    public void setSeasonOfAccessories(String seasonOfAccessories) {
       this.seasonOfAccessories = seasonOfAccessories;
    }

    public String getColorOfAccessories() {
       return colorOfAccessories;
    }

    public void setColorOfAccessories(String colorOfAccessories) {
       this.colorOfAccessories = colorOfAccessories;
    }

    public int getYearMonthOfCollectionClothes() {
       return yearMonthOfCollectionClothes;
    }

    public void setYearMonthOfCollectionClothes(int yearMonthOfCollectionClothes) {
       this.yearMonthOfCollectionClothes = yearMonthOfCollectionClothes;
    }
 }
