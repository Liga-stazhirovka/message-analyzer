package liga.medical.message_analyzer.dto;

import liga.medical.message_analyzer.message_status.MessageStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class MessageDto implements Serializable {
    private MessageStatus status;
    private String message;
}
