package com.Flipkart.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvPurchaseSteps {
	@Given("user will launch the FlipKart website")
	public void user_will_launch_the_FlipKart_website() {
		System.out.println("browser lanuched successfully");
		WebDriverManager.chromedriver().setup();
		MobilePurchseSteps.driver=new ChromeDriver();
		MobilePurchseSteps.driver.get("https://www.flipkart.com/");
		MobilePurchseSteps.driver.manage().window().maximize();
	    
	}

	@When("User will Search the TV")
	public void user_will_Search_the_TV() throws Throwable {
			WebElement search = MobilePurchseSteps.driver.findElement(By.xpath("//input[@type='text']"));
			search.sendKeys("Redmi tv",Keys.ENTER);
			WebElement move =MobilePurchseSteps. driver.findElement(By.xpath("//input[@type='text']"));
			Actions acc=new Actions(MobilePurchseSteps.driver);
			Thread.sleep(1000);
			acc.moveToElement(move).perform();
			System.out.println("move to element");
	    
	}

	@When("User will select the TV")
	public void user_will_select_the_TV() {
		WebElement mobile1=MobilePurchseSteps.driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		mobile1.click();
	}
	@When("User will Search the TV by one dim list")
	public void user_will_Search_the_TV_by_one_dim_list(DataTable dataTable) throws Throwable {
	    List<String> asList = dataTable.asList();
		WebElement search = MobilePurchseSteps.driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys(asList.get(0),Keys.ENTER);
		WebElement move =MobilePurchseSteps. driver.findElement(By.xpath("//input[@type='text']"));
		Actions acc=new Actions(MobilePurchseSteps.driver);
		Thread.sleep(1000);
		acc.moveToElement(move).perform();
		System.out.println("move to element");
	   
	}
	@When("User will Search the TV by one dim Map")
	public void user_will_Search_the_TV_by_one_dim_Map(DataTable dataTable) throws Throwable {
	  Map<String,String> asMap = dataTable.asMap(String.class,String.class);
	  WebElement search = MobilePurchseSteps.driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys(asMap.get("tv2"),Keys.ENTER);
		WebElement move =MobilePurchseSteps. driver.findElement(By.xpath("//input[@type='text']"));
		Actions acc=new Actions(MobilePurchseSteps.driver);
		Thread.sleep(1000);
		acc.moveToElement(move).perform();
		System.out.println("move to element");
	}

}
