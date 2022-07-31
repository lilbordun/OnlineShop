package orders;

import goods.Items;

public class CustomerBag  {
private Items amount;
private  Items idOfItem;
private Items price;
private String nameOfItem;

    CustomerBag(){}

    CustomerBag(String nameOfItem, Items amount, Items idOfItem, Items price){
        this.nameOfItem= nameOfItem;
        this.amount = amount;
        this.idOfItem = idOfItem;
        this.price = price;
    }

    public Items getAmount() {
        return amount;
    }

    public void setAmount(Items amount) {
        this.amount = amount;
    }

    public Items getIdOfItem() {
        return idOfItem;
    }

    public void setIdOfItem(Items idOfItem) {
        this.idOfItem = idOfItem;
    }

    public Items getPrice() {
        return price;
    }

    public void setPrice(Items price) {
        this.price = price;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }
}
