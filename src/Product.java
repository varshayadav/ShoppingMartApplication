class Product {
    private final String name;
    private final double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getCost(int quantity) {
        return price * quantity;
    }
}
