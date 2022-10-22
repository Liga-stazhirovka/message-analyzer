package liga.medical.message_analyzer.core.producer;

import liga.medical.message_analyzer.api.CommonMonitoringProducer;
import liga.medical.message_analyzer.producer.MessageProducer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import static liga.medical.message_analyzer.core.config.RabbitConfiguration.QUEUE_NAME;

@Component
@Getter
@RequiredArgsConstructor
public class CommonMonitoringProducerImpl implements CommonMonitoringProducer {
    private final RabbitTemplate template;

    @Override
    public void sendMessage(MessageProducer messageProducer) {
        template.convertAndSend(QUEUE_NAME, messageProducer);
    }
}
