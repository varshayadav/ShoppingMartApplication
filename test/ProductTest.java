import org.junit.Assert;
import org.junit.Test;

public class ProductTest {


    @Test
    public void should_return_cost_of_chocolate_as_40() throws Exception {
        Product chocolate = new Product("chocolate", 40);
        Assert.assertEquals(chocolate.getCost(1), 40, 0);

    }

    @Test
    public void should_return_cost_of_2_books_as_200() throws Exception {
        Product book = new Product("book", 100);
        Assert.assertEquals(book.getCost(2), 200, 0);

    }
}
