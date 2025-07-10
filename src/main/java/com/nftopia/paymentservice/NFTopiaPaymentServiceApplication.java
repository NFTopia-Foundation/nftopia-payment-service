package com.nftopia.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NFTopiaPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NFTopiaPaymentServiceApplication.class, args);
		System.out.println("NFTopia Payment Service is currently running on port 9003");
	}

}
