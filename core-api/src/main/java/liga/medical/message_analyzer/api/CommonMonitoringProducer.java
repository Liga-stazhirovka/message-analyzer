package liga.medical.message_analyzer.api;

import liga.medical.message_analyzer.producer.MessageProducer;

public interface CommonMonitoringProducer {
    void sendMessage(MessageProducer messageProducer);
}
