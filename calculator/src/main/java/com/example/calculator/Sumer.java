package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sumer {

	@Autowired
	private DataSource dataSource;

	public Sumer(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int sum() {
		int[] data = dataSource.getData();
		
		int total = 0;
		for (int i=0; i<data.length; i++) {
			total += data[i];
		}
		return total;
	}

}
