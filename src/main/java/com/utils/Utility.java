package com.utils;

import org.testng.Assert;

public class Utility {
	public static void verify(String expectedvalue, String actualvalue) {
		if(expectedvalue.equalsIgnoreCase(actualvalue)) {
			System.out.println("The Test is passed");
			}else {
				System.out.println("The Test is failed");
			}
		System.out.println("Expected value is : "+expectedvalue);
		System.out.println("Actual value is : "+actualvalue);
		
	}

}
