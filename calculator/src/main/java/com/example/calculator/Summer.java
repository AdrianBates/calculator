package com.example.calculator;

public class Summer {

	private DataSource dataSource;

	public Summer(DataSource dataSource) {
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
