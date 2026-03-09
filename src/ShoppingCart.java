import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items;

    public ShoppingCart(){
        items = new HashMap<>();
    }

    public void addItem(String itemName, double price) {
        if (itemName != null && price >= 0) {
            if (items.containsKey(itemName)) {
                String newname = itemName + "Duplicate";
                items.put(newname, price);
            } else {
                items.put(itemName, price);
            }
        } else {
            throw new IllegalArgumentException("Item name cannot be null and price cannot be negative.");
        }
    }

    public void removeItem(String itemName) {
        if (items.containsKey(itemName)) {
            items.remove(itemName);
        } else {
            // Item not found, do nothing
        }
    }

    public Double getTotal() {
        double total = 0.0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }
}
