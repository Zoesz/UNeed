package com.everything.uneed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class UneedApplication {

	public static void main(String[] args) {
		SpringApplication.run(UneedApplication.class, args);


		System.out.println(1);
		int time = 20;
		try {
			TimeUnit.SECONDS.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("Don't interrupt me, just wait " + time + " !");
		}
		System.out.println(9);
	}



}
