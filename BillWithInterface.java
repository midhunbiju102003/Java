interface Billable {
    double calculate();
}

class Product implements Billable {
    private int productId;
    private String name;
    private int quantity;
    private double unitPrice;

    public Product(int id, String productName, int qty, double price) {
        productId = id;
        name = productName;
        quantity = qty;
        unitPrice = price;
    }

    public double calculate() {
        return quantity * unitPrice;
    }

    public void displayProduct() {
        System.out.printf("%-10d%-10s%-10d%-15.2f%-10.2f%n", 
                          productId, name, quantity, unitPrice, calculate());
    }
}

public class BillWithInterface {
    public static void main(String[] args) {
        Product p1 = new Product(101, "A", 2, 25.0);
        Product p2 = new Product(102, "B", 1, 100.0);

        double netAmount = p1.calculate() + p2.calculate();

        System.out.println("Order No.: 123   Date: 2025-04-15");
        System.out.printf("%-10s%-10s%-10s%-15s%-10s%n", 
                          "ProductId", "Name", "Quantity", "Unit Price", "Total");

        p1.displayProduct();
        p2.displayProduct();

        System.out.printf("%-45s%-10.2f%n", "Net Amount:", netAmount);
    }
}
