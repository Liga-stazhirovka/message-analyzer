package liga.medical.message_analyzer.core.controller.model;

import liga.medical.message_analyzer.dto.MessageStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class MessageInfoRequest {
    private MessageStatus status;
    private String message;
}