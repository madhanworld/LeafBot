package runner;

import org.testng.annotations.BeforeTest;

import com.leafBot.testng.api.base.Annotations;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.Feature",
				 glue={"com/leafBot"}, 
				 monochrome=true)

public class LoginUsingCucumber extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "001 - Login";
		testcaseDec = "Login to the application";
		author = "Sethu";
		category = "smoke";
	} 

}




