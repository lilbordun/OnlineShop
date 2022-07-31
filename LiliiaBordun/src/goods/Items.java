package goods;

abstract public class Items {
    private int idOfItem;
    private int amount;
    private double price;

    Items (){}

    Items(int idOfItem, int amount, double price){
        this.idOfItem = idOfItem;
        this.price = price;
        this.amount = amount;
    }



    public int getIdOfItem() {
        return idOfItem;
    }

    public void setIdOfItem(int idOfItem) {
        this.idOfItem = idOfItem;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
