package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void sum() {
		int a = 20;
		int b = 20;		
		Assert.assertEquals(40, a+b);
		
	}
	
	@Test
	public void minus() {
		int a = 10;
		int b = 20;		
		Assert.assertEquals(10, b-a);
		//System.out.println(total);
	}
	
}
