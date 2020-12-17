package stepDefinition;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.LoggerFactory;

import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.SeleniumTest;

public class Test_Steps extends SeleniumTest {

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("You're on login page");
	}

//	@And("^User enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
//		Thread.sleep(4000);
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("pass")).sendKeys(password);
//		driver.findElement(By.name("login")).click();
//	}
	@And("^User enters Credentials to LogIn$")
	 public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
	 
	 //Write the code to handle Data Table
	 //List<List<String>> data = usercredentials.raw();

		// List<java.util.Map<String, String>> data = usercredentials.asMaps(String.class,String.class);
	 
	 //This is to get the first data of the set (First Row + First Column)
		// driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
	// driver.findElement(By.id("email")).sendKeys(data.get(0).get("Username")); 
	 
	 //This is to get the first data of the set (First Row + Second Column)
//	     driver.findElement(By.id("pass")).sendKeys(data.get(0).get(1));
	//     driver.findElement(By.id("pass")).sendKeys(data.get(0).get("Password"));
	 
	 //    driver.findElement(By.name("login")).click();
		 List<java.util.Map<String, String>> data = usercredentials.asMaps(String.class, String.class);
		 for(int i=0; i<data.size(); i++)  {
			 driver.findElement(By.id("email")).sendKeys(data.get(i).get("Username")); 
			     driver.findElement(By.id("pass")).sendKeys(data.get(i).get("Password"));
			     driver.findElement(By.name("login")).click();
			 }
	     
	 }

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				Actions action = new Actions(driver);
				  action.sendKeys(Keys.ESCAPE).build().perform();
			     //code to do if not exist.
					driver.findElement(By.id("userNavigationLabel")).click();
					//driver.findElement(By.className("_54nc")).click();
					driver.findElement(By.linkText("Log Out")).click();
			  
////	//Create a map to store  preferences 
//		HashMap<String, Object> prefs = new HashMap<String, Object>();
//
//		//add key and value to map as follow to switch off browser notification
//		//Pass the argument 1 to allow and 2 to block
//		prefs.put("profile.default_content_setting_values.notifications", 2);
//
//		//Create an instance of ChromeOptions 
//		ChromeOptions options = new ChromeOptions();
//
//		// set ExperimentalOption - prefs 
//		options.setExperimentalOption("prefs", prefs);
//
//		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
//		WebDriver driver = new ChromeDriver(options);
//		Thread.sleep(5000);
	

	}
	
	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
	}
}
