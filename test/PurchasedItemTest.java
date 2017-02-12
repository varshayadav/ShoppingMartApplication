import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PurchasedItemTest {
    @Test
    public void should_return_cost_for_1_books_as_40() throws Exception {
        Product book = new Product("book", 40);
        List categories = new ArrayList<>(Arrays.asList(Category.Exempted));
        PurchasedItem purchased_item = new PurchasedItem(book, 1, categories);
        Assert.assertEquals(40, purchased_item.calculateCost(), 0);
    }

    @Test
    public void should_return_cost_for_2_chocolates_as_80() throws Exception {
        Product chocolates = new Product("chocolates", 40);
        List categories = new ArrayList<>(Arrays.asList(Category.Exempted));
        PurchasedItem purchased_item = new PurchasedItem(chocolates, 2, categories);
        Assert.assertEquals(80, purchased_item.calculateCost(), 0);
    }

    @Test
    public void should_return_tax_for_1_shoes_as_10() throws Exception {
        Product shoes = new Product("shoes", 100);
        List categories = new ArrayList<>(Arrays.asList(Category.NonExempted));
        PurchasedItem purchased_item = new PurchasedItem(shoes, 1, categories);
        Assert.assertEquals(10, purchased_item.calculatePurchaseTaxAmount(), 0);
    }

    @Test
    public void should_return_tax_for_1_book_as_0() throws Exception {
        Product book = new Product("book", 100);
        List categories = new ArrayList<>(Arrays.asList(Category.Exempted));
        PurchasedItem purchased_item = new PurchasedItem(book, 1, categories);
        Assert.assertEquals(0, purchased_item.calculatePurchaseTaxAmount(), 0);
    }

    @Test
    public void should_return_taxed_cost_for_1_shoe_as_110() throws Exception {
        Product shoe = new Product("shoe", 100);
        List categories = new ArrayList<>(Arrays.asList(Category.NonExempted));
        PurchasedItem purchased_item = new PurchasedItem(shoe, 1, categories);
        Assert.assertEquals(110, purchased_item.calculateCostWithTax(), 0);
    }

    @Test
    public void should_return_taxed_cost_for_2_imported_medicine_as_220() throws Exception {
        Product medicine = new Product("medicine", 100);
        List categories = new ArrayList<>(Arrays.asList(Category.Exempted, Category.Imported));
        PurchasedItem purchased_item = new PurchasedItem(medicine, 2, categories);
        Assert.assertEquals(210, purchased_item.calculateCostWithTax(), 0);
    }
    @Test
    public void should_return_taxed_cost_for_2_imported_shoes_as_230() throws Exception {
        Product medicine = new Product("shoes", 100);
        List categories = new ArrayList<>(Arrays.asList(Category.NonExempted, Category.Imported));
        PurchasedItem purchased_item = new PurchasedItem(medicine, 2, categories);
        Assert.assertEquals(230, purchased_item.calculateCostWithTax(), 0);
    }


}
