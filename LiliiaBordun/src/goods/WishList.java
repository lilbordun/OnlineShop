package goods;

import java.util.ArrayList;

public class WishList extends Items implements WisheList{
private ArrayList<String> wishItems = new ArrayList<>();

@Override
public  void addItemsToWishList(){
        System.out.println("New item was added");
};

}
