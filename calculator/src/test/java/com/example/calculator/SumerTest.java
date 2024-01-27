package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SumerTest {
	
	private DataSource mockSource = mock();
	
	private Sumer sumer = new Sumer(mockSource);
	
	@Test
	public void testSum_123_6() {
		
		when(mockSource.getData()).thenReturn(new int[]{0, 1, 2, 3});

		assertEquals(6, sumer.sum());
		
		verify(mockSource).getData();
	}

	@Test
	public void testSum_234_9() {
		
		when(mockSource.getData()).thenReturn(new int[]{2, 3, 4});

		assertEquals(9, sumer.sum());
		
		verify(mockSource).getData();
	}
}
