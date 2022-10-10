package liga.medical.message_analyzer.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"liga.medical.message_analyzer", "liga.medical.common.service"})
public class MessageAnalyzer {

    public static void main(String[] args) {
        SpringApplication.run(MessageAnalyzer.class, args);
    }

}