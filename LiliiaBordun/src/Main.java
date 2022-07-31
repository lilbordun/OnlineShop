import goods.Clothes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    abstract public static class Shoes extends Clothes.Discounts {
        private String categoryShoes;
        private String seasonShoes;
        private String colorShoes;
        private int yearMonthOfCollectionShoes;

    }
}