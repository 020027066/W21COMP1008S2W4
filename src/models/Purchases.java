package models;

import models.GroceryItem;

import java.util.ArrayList;

public class Purchases {

    private ArrayList<GroceryItem> shoppingCart;

    public Purchases(){
        shoppingCart = new ArrayList<>();
    }

    /**
     * This method will add a GroveryItem to the shopping cart
     * @param groceryItem
     */
    public void addGroceryItem(GroceryItem groceryItem){
        shoppingCart.add(groceryItem);
    }

    /**
     * This method will return the total price of all the purchases (no tax for CS students)
     */
    public double getTotalPrice(){
        double totalPrice = 0;

//        adding all price items together, method 1
//        for (int i=0; i<shoppingCart.size(); i++)
//            totalPrice = totalPrice + shoppingCart.get(i).getPrice();
//        //  totalPrice += shoppingCart.get(i).getPrice();

        for(GroceryItem groceryItem : shoppingCart)
            totalPrice += groceryItem.getPrice();
        return totalPrice;
    }


}
