package liga.medical.message_analyzer.producer;

import liga.medical.message_analyzer.message_status.MessageStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.AccessLevel;

import java.io.Serializable;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageProducer implements Serializable {
    private MessageStatus status;
    private String message;
}
