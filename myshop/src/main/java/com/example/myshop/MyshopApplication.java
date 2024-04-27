package com.example.myshop;

import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.myshop.ApplicationStartingListener;

@SpringBootApplication
public class MyshopApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MyshopApplication.class);
		app.addListeners(new ApplicationStartingListener());
		app.run(args);
	}
}
