package execution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/Features/Login.feature"},
	
				
		glue = {"execution"},
		
//		plugin = {"pretty", "rerun:target/failedrun.txt"}
				publish = true,
		
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)


public class AmazonTest extends AbstractTestNGCucumberTests{

}
