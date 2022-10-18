package liga.medical.message_analyzer.producer;

import liga.medical.message_analyzer.message_status.MessageStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class MessageProducer {
    private MessageStatus status;
    private String message;
}
