package mcd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Tests the Input Box page on SeleniumEasy.com
// URL = https://www.seleniumeasy.com/test/basic-first-form-demo.html
public class TestCase1  {
	
	WebDriver driver;
	
	
	// Setups runs BEFORE each test cases
	@Before
	public void setUp() throws Exception {
		// 1. setup selenium + your webdriver
		// Selenium + Chrome
		System.setProperty("webdriver.chrome.driver", 
				"/Users/macstudent/Desktop/chromedriver");
		driver = new ChromeDriver();
		// 2. go to website
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		System.out.println("THIS IS SETUP");
	}

	// Teardown() runs AFTER each test case
	@After
	public void tearDown() throws Exception {
		// After you run the test case, close the browser
		//Thread.sleep(5000);
		//driver.close();
	}

	
	// TC1: Test single input field functionality
	@Test
	public void testSingleInputField() throws InterruptedException {
		// 1. Enter some value into the text box
		// - GET the box (the box has a unique id)
		WebElement inputBox = driver.findElement(By.id("user-message"));
		// - TYPE NONSESE INTO THE BOX
		inputBox.sendKeys("here is some nonsense");
		// 2. Push the button
		// - GET the button
		WebElement showMessageButton = driver.findElement(
				By.cssSelector("form#get-input button"));
		// - PUSH the button
		showMessageButton.click();
		
		
		// ----------------------------------------------
		// 3. Get the actual output from the screen
		WebElement outputBox = driver.findElement(By.id("display"));
		String actualOutput = outputBox.getText();
		
		// 4. Check if expected output == actual output
		assertEquals("here is some nonsense", actualOutput);
	}
	
	// TC2: Test the two input fields functionality
	@Test
	public void testThreeInputFields() throws InterruptedException {

		// 1. Type First Name  into input box 1
		WebElement inputBox1 = driver.findElement(By.id("inb1"));
		inputBox1.sendKeys("Sumandeep");
		// 2. Type Email address into input box 2
		WebElement inputBox2 = driver.findElement(By.id("inb2"));
		inputBox2.sendKeys("maansuman2602@gmail.com");
		// 3. Type Postal code into input box 3
				WebElement inputBox3 = driver.findElement(By.id("inb3"));
				inputBox3.sendKeys("L7A1T9");
		// 3. Press the button
		WebElement button = driver.findElement(
				By.cssSelector("#firstname2"));
		
	button.sendKeys("diljeit");
		button.click();
		
		// 4. Get the output from the screen
		WebElement outputBox = driver.findElement(By.id("displayvalue"));
		String actualOutput = outputBox.getText();
		
		// 5. Check if actual == expected
		assertEquals("75", actualOutput);
	}
	
}