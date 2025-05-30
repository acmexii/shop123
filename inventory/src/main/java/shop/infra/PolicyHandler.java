package shop.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shop.config.kafka.KafkaProcessor;
import shop.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    InventoryRepository inventoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ShippingCompleted'"
    )
    public void wheneverShippingCompleted_DecreaseStock(
        @Payload ShippingCompleted shippingCompleted
    ) {
        ShippingCompleted event = shippingCompleted;
        System.out.println(
            "\n\n##### listener DecreaseStock : " + shippingCompleted + "\n\n"
        );

        // Sample Logic //
        Inventory.decreaseStock(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
