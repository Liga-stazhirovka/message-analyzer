package liga.medical.message_analyzer.core.service;

import liga.medical.message_analyzer.api.MessageService;
import liga.medical.message_analyzer.core.producer.CommonMonitoringProducer;
import liga.medical.message_analyzer.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final CommonMonitoringProducer producer;

    @Override
    public void sendMessage(Message message) {
        producer.sendMessage(message);

    }
}
