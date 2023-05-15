package com.stepDefinition;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public static WebDriver driver;

	@Given("Login to the LinkedIn")
	public void login_to_the_LinkedIn() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://in.linkedin.com/?src=go-pa&trk=sem-ga_campid.14650114788_asid.151761418307_crid.657403558718_kw.linkedin%20login_d.c_tid.kwd-12704335873_n.g_mt.e_geo.9061895&mcid=6844056167778418689&cid=&gclid=CjwKCAjwx_eiBhBGEiwA15gLN4BT9KEYx5INzVzqHWGZ3uWo7Yz7KYKMqVci_QlaiwZEtGvIanSZ2BoCbX8QAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
	}

	@When("User click the Sign in Button User should able to navigate Home Page")
	public void user_click_the_Sign_in_Button_User_should_able_to_navigate_Home_Page() throws Throwable {
		driver.findElement(By.id("session_key")).sendKeys("baranikumarsk96@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Suriya@96");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("Click the Jobs Icon")
	public void click_the_Jobs_Icon() throws Exception {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement jobicon = driver.findElement(By.xpath("(//a[@target='_self'])[3]"));
		j.executeScript("arguments[0].click();", jobicon);
	}

	@When("Click the job which present Easy Apply option")
	public void click_the_job_which_present_Easy_Apply_option() throws Throwable {
		// Click Show More Button
		Thread.sleep(4000);
		List<WebElement> easyapply = driver.findElements(By.xpath("//li[text()='Easy Apply']"));
		System.out.println(easyapply.size());
		
		if (easyapply.size()>0) {
			easyapply.get(0).click();
			
		} else {
			
			System.out.println("No easy apply available");
			
			List<WebElement> showall = driver.findElements(By.xpath("(//span[text()='Show all'])[1]"));
			showall.get(0).click();
			easyapply.get(0).click();

		}
//		driver.findElement(By.xpath("(//div[@class='discovery-templates-vertical-list__footeroverflow-hidden'])[1]"))
//				.click();
//
//		// Click Easy Apply Icon in Job page
//		driver.findElement(By.xpath(
//				"(//li[@class='job-card-container__apply-method job-card-container__footer-item inline-flex align-items-center'])[1]"))
//				.click();
	}

	@When("Click the Easy Apply Button for Job Apply")
	public void click_the_Easy_Apply_Button_for_Job_Apply() throws Throwable {
		

		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Easy Apply'])[1]")).click();

	}

	@When("Enter the First name , Last name, Mobile Number , Email address , Click the next button")
	public void enter_the_First_name_Last_name_Mobile_Number_Email_address_Click_the_next_button() throws Throwable {
		
		WebElement Mnumber = driver.findElement(By.xpath("//input[@class=' artdeco-text-input--input']"));
		Mnumber.clear();
		Mnumber.sendKeys("8148816952");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Review']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit application']")).click();
		Thread.sleep(2000);
		
		
		WebElement Fname = driver.findElement(By.xpath("(//input[@class=' artdeco-text-input--input'])[1]"));
		Fname.clear();
		Fname.sendKeys("Barani");
		WebElement Lname = driver.findElement(By.xpath("(//input[@class=' artdeco-text-input--input'])[2]"));
		Lname.clear();
		Lname.sendKeys("Kumar");
		driver.findElement(By.xpath("//button[@aria-label='Continue to next step']")).click();
	}

	@Then("Enter the City and Click Next Button")
	public void enter_the_City_and_Click_Next_Button() {
		WebElement City = driver
				.findElement(By.xpath("//div[@class='search-basic-typeahead search-vertical-typeahead']"));
		City.sendKeys("chennai");
		driver.findElement(By.xpath("//button[@aria-label='Continue to next step']")).click();
	}

	@Then("Select the Resume and Click Next Button")
	public void select_the_Resume_and_Click_Next_Button() {
		driver.findElement(By.xpath("(//label[@class='jobs-document-upload-redesign-card__toggle-label t-bold'])[1]"))
				.click();

		driver.findElement(By.xpath("//button[@aria-label='Continue to next step']")).click();
	}

	@Then("Select the work experince and Click Next Button")
	public void select_the_work_experince_and_Click_Next_Button() {
		driver.findElement(By.xpath("//button[@aria-label='Continue to next step']")).click();
	}

	@Then("given the Education Details")
	public void given_the_Education_Details() {
		driver.findElement(By.xpath("//button[@aria-label='Continue to next step']")).click();
	}

	@Then("Enter the Screening questions URI")
	public void enter_the_Screening_questions_URI() {
		WebElement Squestion = driver.findElement(By.xpath("//input[@class=' artdeco-text-input--input']"));
		Squestion.clear();
		Squestion.sendKeys("https://www.linkedin.com/in/barani-kumar-4b0883260");
		driver.findElement(By.xpath("//button[@aria-label='Continue to next step']")).click();
	}

	@Then("Click the Agree Condition Box")
	public void click_the_Agree_Condition_Box() {
		driver.findElement(By.xpath("//label[@class='t-14']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Continue to next step']")).click();
	}

	@Then("Click the review button and Submit Application Button")
	public void click_the_review_button_and_Submit_Application_Button() throws Throwable {
		driver.findElement(By.xpath("//button[@aria-label='Review your application']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Submit application']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Dismiss']")).click();

	}

}



