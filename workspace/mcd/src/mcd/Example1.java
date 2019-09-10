package mcd;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

// 1. FIND THE THING YOU WANT TO INTERACT WITH
// THING = input box, button, image, dropdown, link

// 2. WHAT DO YOU WANT TO DO WITH IT?

// 3. Convert this into code

/// ---------
// I want to downaload an image from Instagram
// Precondition -- Go to the instagram page
// Steps: <------ converting into code
// 1.  Find the image
// 2.  Right click > Save Image As
// 3.  Done


// ------------
// Example 2 - I want to test Login on Facebook website
// Precondition - you need to go to facebook.com
// Steps:  <--- convert this to code using the selenium functions
// 1. Find the username login box
// 2. Click on the box
// 3. Enter a username:  jenelle@gmail.com
// 4. Find the password login box
// 5. Click on the password box
// 6. Enter a password:  1111  --->  .sendKeys("1111");
// 7. Find the login button
// 8. Click on the login button  ->  .click()
// 9. Make sure that it goes to the next page

//-------------
// Example 3 - Testing the search on duckduckgo.com
// Precondition - you need to be on duckduckgo.com
// Steps:
// 1. Find the search box
// 2. Type a search term into the box (example: how to install eclipse)
// 3. Find the search button
// 4. Click on search button
// 5. Check that you went to the next page
// 6. Find (Look at) the search results
// 7. Check that first result is a page with title = "Eclipse Installer 2018-12 R | Eclipse Packages"

public class  Example1  {
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		// Windows
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
		// 1. Configure Selenium to talk to Chrome
		System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// 2. Enter the website you want to go to
		String baseUrl = "https://www.facebook.com/login/";
		
		// 3. Open Chrome and go to the base url;
		driver.get(baseUrl);
	
		// 4. Enter a username
		// ---------------------
		// 4a. Find the box
		WebElement usernameBox = driver.findElement(By.id("email"));
		// 4b. Put the user name in there
		usernameBox.sendKeys("jenelle@gmail.com");

		// 5. Enter a password
		// ---------------------
		// 5a. Find the password box
		WebElement passwordBox = driver.findElement(By.id("pass"));
		// 5b. Put the password in there
		passwordBox.sendKeys("fakepassword123!!!!@");
		
		
		Thread.sleep(1000);
		
		// 6. Press the login button
		// ---------------------
		// 6a. Find the login button
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		// 6b. Click the button
		loginButton.click();
		
		// 7. Close the browser
		Thread.sleep(10000);  //pause for 1 second before closing the browser
		driver.close();
		
		
		
		// get the actual value of the title
//		actualTitle = driver.getTitle();
//		System.out.println("Title of webpage: " + actualTitle);
		

				
		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
//		if (actualTitle.contentEquals(expectedTitle)){
//		    System.out.println("Test Passed!");
//		} else {
//		    System.out.println("Test Failed");
//		    }
//		   
//		    //close Chrome
		   // driver.close();
		   
	}

}