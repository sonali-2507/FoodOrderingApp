package Models;

public class FoodItems {
    String itemName; // tea, coffee,maggie etc..
    Enum typeOfItem; //breakfasts, lunch, dinner

    //constructor

    public FoodItems(String itemName, Enum typeOfItem) {
        this.itemName = itemName;
        this.typeOfItem = typeOfItem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Enum getTypeOfItem() {
        return typeOfItem;
    }

    public void setTypeOfItem(Enum typeOfItem) {
        this.typeOfItem = typeOfItem;
    }
}
