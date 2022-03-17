package com.stepDefiniton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

	@Given("^user is on loginpage$")
	public void user_is_on_loginpage() {
		System.out.println("step1:user is on loginpage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("step2:user enters username and password");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("step3:user is clicking on login button");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("user should land on homepage")
	public void user_should_land_on_homepage() {
		System.out.println("step4:user land on Homepage");
		driver.close();
	}

}
