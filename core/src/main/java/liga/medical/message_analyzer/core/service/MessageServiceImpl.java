package liga.medical.message_analyzer.core.service;

import liga.medical.message_analyzer.api.CommonMonitoringProducer;
import liga.medical.message_analyzer.api.MessageService;
import liga.medical.message_analyzer.dto.MessageDto;
import liga.medical.message_analyzer.utils.mapper.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final CommonMonitoringProducer producer;
    private final MessageMapper mapper;

    @Override
    public void sendMessage(MessageDto messageDto) {
        producer.sendMessage(mapper.toProducer(messageDto));
    }
}
