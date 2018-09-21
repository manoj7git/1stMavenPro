package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {

	@Test
	public void sum() {
		int a = 10;
		int b = 20;
		//int total = a+b;
		Assert.assertEquals(30, a+b);
		//System.out.println(total);
	}
	
}
