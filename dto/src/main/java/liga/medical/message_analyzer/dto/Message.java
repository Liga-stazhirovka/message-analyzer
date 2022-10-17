package liga.medical.message_analyzer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Message implements Serializable {
    private MessageStatus status;
    private String message;
}
