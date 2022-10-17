package liga.medical.message_analyzer.core.controller;

import liga.medical.message_analyzer.api.MessageService;
import liga.medical.message_analyzer.core.controller.model.MessageInfoRequest;
import liga.medical.message_analyzer.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody MessageInfoRequest request) {
        messageService.sendMessage(new Message(request.getStatus(), request.getMessage()));
        System.out.println("Send message : " + request);
        return ResponseEntity.ok(request.getStatus().toString());
    }
}