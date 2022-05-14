package com.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	
	@Before
	public void beforeHook() {
		System.out.println("++++++ before hook attched each method++++++");
	}
	@After
	public void AfterHook() {
		System.out.println("------- After hook attched each method------");
	}
	@Before("@first")
	public void beforemethodHook() {
		System.out.println("======= beforemethod hook attched each method=======");
	}

}
