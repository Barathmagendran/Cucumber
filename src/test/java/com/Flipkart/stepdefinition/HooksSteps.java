package com.Flipkart.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksSteps {
	@Before
	public void before() {
		System.out.println("Before Scenario");
	}
	@After
	public void after() {
		System.out.println("after Scenario");
	}
}
