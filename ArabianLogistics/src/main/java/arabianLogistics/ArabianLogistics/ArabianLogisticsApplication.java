package arabianLogistics.ArabianLogistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import arabianLogistics.ArabianLogistics.data.model.User;

@SpringBootApplication
public class ArabianLogisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArabianLogisticsApplication.class, args);
		User user = new User();
		user.setName("Victor");
		user.addUser();

	}

}
