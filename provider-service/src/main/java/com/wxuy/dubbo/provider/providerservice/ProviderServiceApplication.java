package com.wxuy.dubbo.provider.providerservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableDubbo
public class ProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceApplication.class, args);
	}

}
