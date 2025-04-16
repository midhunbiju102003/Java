
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

    // Implementation of calculate method from interface
    public double calculate() {
        return quantity * unitPrice;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.printf("%-12d%-12s%-12d%-16.2f%-10.2f%n",
                          productId, name, quantity, unitPrice, calculate());
    }
}

public class BillWithInterface {
    public static void main(String[] args) {
        Product product1 = new Product(101, "A", 2, 25.0);
        Product product2 = new Product(102, "B", 1, 100.0);

        double netAmount = product1.calculate() + product2.calculate();

        // Display the bill
        System.out.println("Order No.: 1234   Date: 2025-04-14");
        System.out.println("Product Id  Name        Quantity    Unit Price      Total");
        product1.displayProduct();
        product2.displayProduct();
        System.out.printf("%-52s%-10.2f%n", "Net Amount", netAmount);
    }
}