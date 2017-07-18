package registeration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;
import utility.Util_functions;

//HAs it got the changes pushed 
public class RegBase {
	
	//intialzing 

	public static Properties CONFIG = null;
	public static Properties or = null;
	public static WebDriver Driver=null;
	public static EventFiringWebDriver DR;
	public  boolean C;
	public  boolean F;
	
	public void intialize() throws IOException, Throwable{
		//Intializing property files  
		
		if(Driver==null) {
		CONFIG = new Properties();
		FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"//src//config//config.properties");
			CONFIG.load(fn);
		or = new Properties();
		fn = new FileInputStream(System.getProperty("user.dir")+"//src//config//OR.properties");
			or.load(fn);
		
		
		//Intializing webdrivers
			
			
				
			
			CONFIG.getProperty("FBro").equals("Firefox");
			
				 System.setProperty("webdriver.gecko.driver",  "//Users//pradumanmehta///eclipse-workspace///Amazon//geckodriver");
				
			Driver = new FirefoxDriver();
				Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				
				
				Thread.sleep(3000);
				 		String logo="Lookers";
				 WebElement element = Driver.findElement(By.xpath("Lookers_Logo"));
				 		String V=element.getText();
				 Assert.assertEquals(logo, V);
				
		
				 
				 CONFIG.getProperty("CBro").equals("Chrome");
					
					System.setProperty("webdriver.chrome.driver", "//Users//pradumanmehta///eclipse-workspace///Amazon//chromedriver");
					 Driver = new ChromeDriver();
			
					// CONFIG.getProperty("IEBro").equals("InternetExplorer");
						
						//System.setProperty("webdriver.IE.driver", "//Users//pradumanmehta///eclipse-workspace///Amazon//chromedriver");
						// Driver = new InternetExplorerDriver();
					
				
			}

		
			
		DR = new EventFiringWebDriver(Driver); 
		DR.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		}
	
	
	public static WebElement Obj(String xapthkey) {
		try {
		return Driver.findElement(By.xpath(or.getProperty(xapthkey)));
		}catch(Throwable t) {
			
		}
		return null;
}

}