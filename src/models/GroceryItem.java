package models;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class GroceryItem {

    private String name;
    private double price;
    private String category;

    public GroceryItem(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("Name must be 2 or more characters");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>=0 && price<=150)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be netween 0 and 150 inclusive");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        List<String> categories = Arrays.asList("meat","dairy","produce","fruit","vegetables","herbs","bread");
        if (categories.contains(category.toLowerCase()))
            this.category = category;
        else
            throw new IllegalArgumentException(category + " is invalic, choose one of " + categories);
    }

}
