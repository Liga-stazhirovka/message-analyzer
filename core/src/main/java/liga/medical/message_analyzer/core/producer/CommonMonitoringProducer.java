package liga.medical.message_analyzer.core.producer;

import liga.medical.message_analyzer.dto.Message;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import static liga.medical.message_analyzer.core.config.RabbitConfiguration.QUEUE_NAME;

@Component
@Getter
@RequiredArgsConstructor
public class CommonMonitoringProducer {
    private final RabbitTemplate template;

    public void sendMessage(Message message) {
        template.convertAndSend(QUEUE_NAME, message);
    }
}
