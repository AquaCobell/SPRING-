package com.nico;

import com.nico.domain.Car;
import com.nico.domain.User;
import com.nico.repository.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class NicoApplication {
//SpringApplication.run(NicoApplication.class, args);
	public static void main(String[] args)
	{
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(NicoApplication.class, args);
		UserRepo userrepo = configurableApplicationContext.getBean(UserRepo.class);

		User user = new User("C999");
		Car mercedes = new Car("mercedes",user);
		Car vw = new Car("vw",user);
		List<Car> cars = Arrays.asList(mercedes,vw);
		user.setAutos(cars);
		userrepo.save(user);

	}

}
