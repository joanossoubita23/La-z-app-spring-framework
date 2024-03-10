import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Producer;
import java.util.Properties;


public class KafkaProducerService {

        private final Producer<String> producer;
        private static final String TOPIC = "product_notifications";

        public KafkaProducerService() {
            Properties props = new Properties();
            props.put("bootstrap.servers", "localhost:9092");
            props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
            props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
            this.producer = (Producer<String>) new KafkaProducer<>(props);
        }

        public void sendNotification(String message) {
            producer.produce((CreationalContext<String>) new ProducerRecord<>(TOPIC, message));
        }

}
