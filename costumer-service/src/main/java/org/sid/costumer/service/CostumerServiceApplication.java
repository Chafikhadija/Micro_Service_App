package org.sid.costumer.service;

import org.sid.costumer.service.entities.Customer;
import org.sid.costumer.service.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CostumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner Start(CustomerRepository customerRepository) {
		return args ->{
			customerRepository.save(new Customer(null, "khadija", "khadijachafi21@gmail.com"));
			customerRepository.save(new Customer(null, "hamza", "Hamzachafi17@gmail.com"));
			customerRepository.save(new Customer(null, "mohammed", "mohammedchafi20@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}

}
