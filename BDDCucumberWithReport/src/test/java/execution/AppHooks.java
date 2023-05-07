package execution;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;


public class AppHooks {
	WebDriver driver;
	@Before
	public void launchBrowser()
	{
		DriverFactory df = new DriverFactory();
		
		 driver = df.initBrowser();
		
		driver.manage().window().maximize();		
		
	}
	
	@After(order = 1)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String scenarioname = scenario.getName();
			
			String srcname = scenarioname.replaceAll(" ", "_");
			
			 TakesScreenshot ts = (TakesScreenshot)driver;
			 
			 byte[] sourcepath = ts.getScreenshotAs(OutputType.BYTES);
			 
			 scenario.attach(sourcepath, "image/png", srcname);
			 
		}
	}

}
