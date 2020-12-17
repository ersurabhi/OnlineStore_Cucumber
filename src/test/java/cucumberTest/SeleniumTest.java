package cucumberTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
public class SeleniumTest {
	public WebDriver driver;
	public SeleniumTest() {
		
//		//Create a map to store  preferences 
//		Map<String, Object> prefs = new HashMap<String, Object>();
//
//		//add key and value to map as follow to switch off browser notification
//		//Pass the argument 1 to allow and 2 to block
//		prefs.put("profile.default_content_setting_values.notifications", 1);
//
//		//Create an instance of ChromeOptions 
//		ChromeOptions options = new ChromeOptions();
//
//		// set ExperimentalOption - prefs 
//		options.setExperimentalOption("prefs", prefs);
//
//		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
//		WebDriver driver = new ChromeDriver(options);
//		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(); 
	
	}

	
	
	
	
//
////	 public static void main(String[] args) {
////		 WebDriver driver;
////		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
////		    driver = new ChromeDriver();  
////	        
////	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////	 
////	       driver.get("https://www.google.com/");
////	 
////	        driver.quit();
////	 
//	private static WebDriver driver;
//	 
//	@Given("^User is on Home Page$")
//	public void User_is_on_Home_Page() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		 //WebDriver driver = null;
//		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
//		 driver = new ChromeDriver(); 
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.shop.demoqa.com");
//	   
//	 }
//	@When("^User Navigate to LogIn Page$")
//	 public void user_Navigate_to_LogIn_Page() throws Throwable {
//	 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//	 }
//	 
//	 @When("^User enters UserName and Password$")
//	 public void user_enters_UserName_and_Password() throws Throwable {
//	 driver.findElement(By.id("log")).sendKeys("testuser_1"); 
//	     driver.findElement(By.id("pwd")).sendKeys("Test@123");
//	     driver.findElement(By.id("login")).click();
//	 }
//	 @Then("^Message displayed Login Successfully$")
//	 public void message_displayed_Login_Successfully() throws Throwable {
//	 System.out.println("Login Successfully");
//	 }
//	 
//	 @When("^User LogOut from the Application$")
//	 public void user_LogOut_from_the_Application() throws Throwable {
//	 driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
//	 }
//	 
//	 @Then("^Message displayed Logout Successfully$")
//	 public void message_displayed_Logout_Successfully() throws Throwable {
//	        System.out.println("LogOut Successfully");
//	 }
	}
//
