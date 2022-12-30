package com.myapp.devops;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.myapp.devops.MigrationDevopsCiApplication;
import com.myapp.devops.model.Product;
import com.myapp.devops.repository.ProductRepository;

@SpringBootApplication
public class MigrationDevopsCiApplication {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MigrationDevopsCiApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args ->{
			List<Product> products= List.of(new Product("Iphone","Iphone14Pro", 85455.5,4.5),
					new Product("onePlus10","Iphone10Pro",65455.5,4.8),
					new Product("SamsungFlip","Samsungflippro",55455.5,4.2));
			repository.saveAll(products);
			repository.findAll().forEach(System.out::println);
		};
	}


}
