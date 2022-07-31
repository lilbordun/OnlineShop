package goods;

 public class Clothes extends Items {
    private String nameOfClothes;
    private String sexCategoryOfClothes;//can be enum
    private String categoryOfClothes;
    private String seasonOfClothes;//can be enum
    private String colorOfClothes;
    private String fabric;
    private int yearMonthOfCollectionClothes;

     Clothes(){}

     Clothes(String nameOfClothes, String categoryOfClothes,
             String colorOfClothes, String fabric, int yearMonthOfCollectionClothes){
    this.nameOfClothes = nameOfClothes;
    this.categoryOfClothes = categoryOfClothes;
    this.colorOfClothes = colorOfClothes;
    this.fabric = fabric;
    this.yearMonthOfCollectionClothes = yearMonthOfCollectionClothes;
         }


    abstract public static class Discounts  {
       private String nameOfDiscount;
       private String typeOfDiscount;
       private double sizeOfDiscount;
   }

     public String getNameOfClothes() {
         return nameOfClothes;
     }

     public void setNameOfClothes(String nameOfClothes) {
         this.nameOfClothes = nameOfClothes;
     }

     public String getSexCategoryOfClothes() {
         return sexCategoryOfClothes;
     }

     public void setSexCategoryOfClothes(String sexCategoryOfClothes) {
         this.sexCategoryOfClothes = sexCategoryOfClothes;
     }

     public String getCategoryOfClothes() {
         return categoryOfClothes;
     }

     public void setCategoryOfClothes(String categoryOfClothes) {
         this.categoryOfClothes = categoryOfClothes;
     }

     public String getSeasonOfClothes() {
         return seasonOfClothes;
     }

     public void setSeasonOfClothes(String seasonOfClothes) {
         this.seasonOfClothes = seasonOfClothes;
     }

     public String getColorOfClothes() {
         return colorOfClothes;
     }

     public void setColorOfClothes(String colorOfClothes) {
         this.colorOfClothes = colorOfClothes;
     }

     public String getFabric() {
         return fabric;
     }

     public void setFabric(String fabric) {
         this.fabric = fabric;
     }

     public int getYearMonthOfCollectionClothes() {
         return yearMonthOfCollectionClothes;
     }

     public void setYearMonthOfCollectionClothes(int yearMonthOfCollectionClothes) {
         this.yearMonthOfCollectionClothes = yearMonthOfCollectionClothes;
     }
 }
