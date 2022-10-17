package liga.medical.message_analyzer.api;

import liga.medical.message_analyzer.dto.Message;

public interface MessageService {
    void sendMessage(Message message);
}
