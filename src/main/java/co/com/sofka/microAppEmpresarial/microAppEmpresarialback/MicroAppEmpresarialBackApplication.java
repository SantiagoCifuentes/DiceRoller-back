package co.com.sofka.microAppEmpresarial.microAppEmpresarialback;

import co.com.sofka.microAppEmpresarial.microAppEmpresarialback.model.Dice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroAppEmpresarialBackApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MicroAppEmpresarialBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Dice dice = new Dice();
		System.out.println(dice);
	}
}
