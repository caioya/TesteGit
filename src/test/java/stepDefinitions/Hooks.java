package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	//uso background no feature ou hooks
	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("before validation");
       	System.out.println("oiee Teste Git3");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("after validation");
	}
}
