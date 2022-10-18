package liga.medical.message_analyzer.utils.mapper;

import liga.medical.message_analyzer.dto.MessageDto;
import liga.medical.message_analyzer.producer.MessageProducer;
import liga.medical.message_analyzer.request.MessageRequest;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface MessageMapper {
    MessageDto toDto(MessageRequest request);

    MessageProducer toProducer(MessageDto messageDto);
}
