package goods;

public class CompareList extends Items {
    private String dateOfComparison;
    private Clothes nameOfClothes;
    private Clothes fabric;
    private Shoes nameOfShoes;
    private Shoes material;
    private Accessories nameOfAccessories;

    CompareList() {
    }

    // тут я створюю декілька конструкторів,адже порівнювати будемо ао одяг або взуття,
    // тому конструктор для всіх параметрів мені не потрібен

    // constructor for compare Clothes
    CompareList(String dateOfComparison, Clothes nameOfClothes, Clothes fabric){
        this.dateOfComparison = dateOfComparison;
        this.nameOfClothes = nameOfClothes;
        this.fabric = fabric;
    }
    // constructor for compare Shoes
    CompareList(String dateOfComparison, Shoes nameOfShoes, Shoes material){
        this.dateOfComparison = dateOfComparison;
        this.nameOfShoes = nameOfShoes;
        this.material = material;
    }

    // constructor for compare Accessories
    CompareList(String dateOfComparison, Accessories nameOfShoes){
        this.dateOfComparison = dateOfComparison;
        this.nameOfAccessories = nameOfShoes;}

    public String getDateOfComparison() {
        return dateOfComparison;
    }

    public void setDateOfComparison(String dateOfComparison) {
        this.dateOfComparison = dateOfComparison;
    }

    public Clothes getNameOfClothes() {
        return nameOfClothes;
    }

    public void setNameOfClothes(Clothes nameOfClothes) {
        this.nameOfClothes = nameOfClothes;
    }

    public Clothes getFabric() {
        return fabric;
    }

    public void setFabric(Clothes fabric) {
        this.fabric = fabric;
    }

    public Shoes getNameOfShoes() {
        return nameOfShoes;
    }

    public void setNameOfShoes(Shoes nameOfShoes) {
        this.nameOfShoes = nameOfShoes;
    }

    public Shoes getMaterial() {
        return material;
    }

    public void setMaterial(Shoes material) {
        this.material = material;
    }

    public Accessories getNameOfAccessories() {
        return nameOfAccessories;
    }

    public void setNameOfAccessories(Accessories nameOfAccessories) {
        this.nameOfAccessories = nameOfAccessories;
    }
}
