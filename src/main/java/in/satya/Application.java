package in.satya;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.satya.service.serviceClass;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		serviceClass bean = context.getBean(serviceClass.class);
		//bean.saveData();
		//bean.get();
		//bean.delete(1);
		bean.deletePassport();
	}

}
