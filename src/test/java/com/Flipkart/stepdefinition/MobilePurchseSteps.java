package com.Flipkart.stepdefinition;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchseSteps {
	static WebDriver driver;
	static long bTime;
	static String text;
	static String text1;
	@Given("user will launch the FliKart website")
	public void user_will_launch_the_FliKart_website() {
		System.out.println("browser lanuched successfully");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	   
	}

	@Given("User will login")
	public void user_will_login() {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	  
	}

	@When("User will Search the mobile")
	public void user_will_Search_the_mobile() throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Redmi Mobiles",Keys.ENTER);
		WebElement move = driver.findElement(By.xpath("//input[@type='text']"));
		Actions acc=new Actions(driver);
		Thread.sleep(1000);
		acc.moveToElement(move).perform();
		System.out.println("move to element");
	    
	}

	@When("User will select the moblie")
	public void user_will_select_the_moblie() {
		WebElement mobile1=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		mobile1.click();
		
	}

	@Then("User will make payments and recivie the cofirmation messsage.")
	public void user_will_make_payments_and_recivie_the_cofirmation_messsage()  {
		System.out.println("Payment Sucessfull");
		driver.quit();
		System.out.println("browser quitted");
	}

	@When("User will Search the mobile by one dim list")
	public void user_will_Search_the_mobile_by_one_dim_list(DataTable dataTable) throws Throwable {
	    List<String> asList = dataTable.asList();
	    WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys(asList.get(0),Keys.ENTER);
		WebElement move = driver.findElement(By.xpath("//input[@type='text']"));
		Actions acc=new Actions(driver);
		Thread.sleep(1000);
		acc.moveToElement(move).perform();
		System.out.println("move to element");
	}
	@When("User will Search the mobile by one dim Map")
	public void user_will_Search_the_mobile_by_one_dim_Map(DataTable dataTable) throws Throwable {
		Map<String,String> asMap = dataTable.asMap(String.class,String.class);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys(asMap.get("Phone2"),Keys.ENTER);
		WebElement move = driver.findElement(By.xpath("//input[@type='text']"));
		Actions acc=new Actions(driver);
		Thread.sleep(1000);
		acc.moveToElement(move).perform();
		System.out.println("move to element");
	    	
	}
	@When("User will Search the mobile {string}")
	public void user_will_Search_the_mobile(String name) throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys(name,Keys.ENTER);
		WebElement move = driver.findElement(By.xpath("//input[@type='text']"));
		Actions acc=new Actions(driver);
		Thread.sleep(1000);
		acc.moveToElement(move).perform();
		System.out.println("move to element");
	}



}
