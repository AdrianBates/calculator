package com.example.calculator;

import org.springframework.stereotype.Component;

@Component
public class HardcodedDataSource implements DataSource {

	@Override
	public int[] getData() {
		return new int[]{0, 1, 2, 4};
	}

}
