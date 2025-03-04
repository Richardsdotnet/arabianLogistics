package arabianLogistics.ArabianLogistics;

import arabianLogistics.ArabianLogistics.security.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class ArabianLogisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArabianLogisticsApplication.class, args);
	}

}
