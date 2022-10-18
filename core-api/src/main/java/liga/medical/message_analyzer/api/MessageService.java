package liga.medical.message_analyzer.api;

import liga.medical.message_analyzer.dto.MessageDto;

public interface MessageService {
    void sendMessage(MessageDto messageDto);
}
