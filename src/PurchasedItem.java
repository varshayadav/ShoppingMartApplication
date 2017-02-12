import java.util.ArrayList;
import java.util.List;

public class PurchasedItem {
    private final Product product;
    private final int quantity;
    private List<Category> categories;

    public PurchasedItem(Product product, int quantity, List<Category> categories) {
        this.product = product;
        this.quantity = quantity;
        this.categories = categories;
    }

    public double calculateCost() {
        return product.getCost(quantity);
    }


    public double calculatePurchaseTaxAmount() {
        double cost = calculateCost();
        double tax = 0;

        for(Category category : categories) {
            tax += (category.tax_percent / 100);
        }
        return cost * tax;
    }

    public double calculateCostWithTax() {
        return calculateCost() + calculatePurchaseTaxAmount();
    }
}