package com.kaspershomedecor.kaspers;

import org.springframework.boot.SpringApplication;

public class TestKaspersApplication {

	public static void main(String[] args) {
		SpringApplication.from(KaspersApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
