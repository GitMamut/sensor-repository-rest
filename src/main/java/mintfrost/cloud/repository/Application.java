package mintfrost.cloud.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static final String DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static final String COMMON_CONTROLLER_DEFAULT_LIMIT = "150";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
