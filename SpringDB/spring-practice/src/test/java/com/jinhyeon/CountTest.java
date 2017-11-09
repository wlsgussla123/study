package com.jinhyeon;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountTest {
	private int count = 0;
	
	@Before
	public void setUp() {
		System.out.println(count++);
	}
	
	@Test
	public void testPlus() {
		System.out.println(count++);
		System.out.println( org.springframework.core.SpringVersion.getVersion() );
	}
	
	@Test
	public void increase() {
		System.out.println(count++);
	}
}
