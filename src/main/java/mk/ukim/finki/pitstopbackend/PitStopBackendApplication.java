package mk.ukim.finki.pitstopbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class PitStopBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PitStopBackendApplication.class, args);
    }

}
