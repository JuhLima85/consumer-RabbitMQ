package br.com.juh.consumer_service.rabbitmq.consumers;

import lombok.extern.log4j.Log4j2;
import org.rabbitmq.commons.dtos.ProductDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static org.rabbitmq.commons.constants.RabbitMQConstants.RK_PRODUCT_LOG;

@Log4j2
@Component
public class ProductConsumer {

    @RabbitListener(queues = {RK_PRODUCT_LOG})
    public void consumer(ProductDTO message) {
        log.info("Mensagem recebida " + message);
    }
}
