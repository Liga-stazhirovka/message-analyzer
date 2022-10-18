package liga.medical.message_analyzer.request;

import liga.medical.message_analyzer.type_status.MessageStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class MessageRequest {
    private MessageStatus status;
    private String message;
}