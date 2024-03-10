public class ProductService {

    private final KafkaProducerService kafkaProducerService;

    public ProductService() {
        this.kafkaProducerService = new KafkaProducerService();
    }

    public void checkAndNotify(Product product) {
        if (product.getQuantity() < 100) {
            kafkaProducerService.sendNotification("Product " + product.getName() + " quantity is below 100!");
        }
    }
}
