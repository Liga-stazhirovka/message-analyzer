package liga.medical.message_analyzer.dto;

import liga.medical.message_analyzer.message_status.MessageStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageDto {
    private MessageStatus status;
    private String message;
}
