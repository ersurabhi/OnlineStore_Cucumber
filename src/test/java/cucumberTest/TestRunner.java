package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
// dryRun= false,
		features = "C:\\Users\\SK\\eclipse-workspace\\OnlineStore\\src\\test\\java\\Feature\\LogIn_Test.feature"
 ,glue= {"stepDefinition"}
//		,monochrome = true
//				,format = {"pretty"}
 )

public class TestRunner {

	public static void main(String[] args) {

	}

}
