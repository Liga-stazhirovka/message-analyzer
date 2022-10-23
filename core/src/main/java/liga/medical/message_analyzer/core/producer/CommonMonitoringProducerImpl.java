package liga.medical.message_analyzer.core.producer;

import liga.medical.message_analyzer.api.CommonMonitoringProducer;
import liga.medical.message_analyzer.producer.MessageProducer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class CommonMonitoringProducerImpl implements CommonMonitoringProducer {
    @Value("${spring.rabbitmq.host}")
    private String queueName;

    private final RabbitTemplate template;

    @Override
    public void sendMessage(MessageProducer messageProducer) {
        template.convertAndSend(queueName, messageProducer);
    }
}
