package runner;

import org.testng.annotations.BeforeTest;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;
@CucumberOptions(features="src/test/java/features/Login.feature",
				 glue="com/leafBot/pages",
				 monochrome=true)


public class TC001_Login extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testcaseName="Login Logout (Cucumber)";
		testcaseDec = "Login and Logout to Leaftaps";
		author="Sarath";
		category="smoke";
		
	}
	

}
