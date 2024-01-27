package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CalculatorMain implements CommandLineRunner {
	
	private final Sumer sumer;
	
	@Autowired
	CalculatorMain(Sumer sumer) {
		this.sumer = sumer;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.sumer.sum());
	}

}
