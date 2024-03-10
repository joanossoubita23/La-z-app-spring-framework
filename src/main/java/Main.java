import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> furnitureProducts = new ArrayList<>();


            // Create a product
            Product couch = new Product(1, "Sample Product", 90);
            furnitureProducts.add(couch);

            // Create ProductService
            ProductService productService = new ProductService();

            // Check and notify if quantity is below 100
            productService.checkAndNotify(couch);
        System.out.println(couch);

    }
}
