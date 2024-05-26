import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class SILab2Tests {

    @Test
    void testCheckCartWhenPaymentIsLowReturnsFalse() {
        Item item1 = new Item("", "123", 45, 0.0f);
        Item item2 = new Item("", "0123", 301, 0.1f);
        LinkedList<Item> allItems = new LinkedList<>();
        allItems.addLast(item1);
        allItems.addLast(item2);

        boolean result = SILab2.checkCart(allItems, 20);

        Assertions.assertFalse(result);
    }

    @Test
    void testCheckCartWhenPaymentIsEnoughReturnsTrue() {
        Item item1 = new Item("", "123", 45, 0.0f);
        Item item2 = new Item("", "0123", 301, 0.1f);
        LinkedList<Item> allItems = new LinkedList<>();
        allItems.addLast(item1);
        allItems.addLast(item2);

        boolean result = SILab2.checkCart(allItems, 80);

        Assertions.assertTrue(result);
    }

}
