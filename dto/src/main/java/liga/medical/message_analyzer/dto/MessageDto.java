package liga.medical.message_analyzer.dto;

import liga.medical.message_analyzer.message_status.MessageStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MessageDto {
    private MessageStatus status;
    private String message;
}
