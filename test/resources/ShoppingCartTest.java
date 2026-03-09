import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void canAddItemToCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        assertEquals(1.0, cart.getTotal());
    }

    @Test
    void canRemoveItemFromCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        cart.removeItem("Apple");
        assertEquals(0.0, cart.getTotal());
    }

    @Test
    void canCalculateTotalWithMultipleItems() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);
        assertEquals(2.25, cart.getTotal());
    }

    @Test
    void canHandleEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotal());
    }

    @Test
    void canHandleRemovingNonExistentItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        cart.removeItem("Banana"); // Removing an item that doesn't exist
        assertEquals(1.0, cart.getTotal()); // Total should remain unchanged
    }

    @Test
    void canHandleAddingDuplicateItems() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        cart.addItem("Apple", 1.0); // Adding the same item again
        assertEquals(2.0, cart.getTotal()); // Total should reflect both items
    }

    @Test
    void canHandleIncorrectPriceInput() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("Apple", -1.0); // Adding an item with a negative price
        });
    }

    @Test
    void canHandleNullItemName() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem(null, 1.0); // Adding an item with a null name
        });
    }
}