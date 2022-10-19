package liga.medical.message_analyzer.request;

import liga.medical.message_analyzer.message_status.MessageStatus;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageRequest {
    private MessageStatus status;
    private String message;
}