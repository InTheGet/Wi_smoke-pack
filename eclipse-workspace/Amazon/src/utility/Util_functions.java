package utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.apache.xpath.operations.Or;

//import org.junit.Before;
//import org.junit.Test;

import registeration.RegBase;

public class Util_functions extends RegBase {
	
	

	/* This method can be worked for general loading of a webpage 
	 With maximum browser screen size
	 30 seconds implicit wait for the page to get time to load 
	 */
	public static void load_lookersGrp() {
		//may be put it on the loop and ask for it open in different browsers or create it in a base class and use the key  
	//	while(CONFIG.getProperty(CBro)) { 
		CONFIG.getProperty("CBro");
	DR.get(CONFIG.getProperty("Grouptsite"));
		DR.manage().window().maximize();
		DR.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Obj("Gobutton").click();
	}
	
	//public static void searchlink() {
		
		/*public static void initBrowser(String browserType) throws IOException {
		    switch (browserType.
		        {
		        case "firefox":
		        			DR.equals(CONFIG.get("FBro"));
		        			page_load();
		        			
		        	//driver = initFFDriver();
		             //break;

		        //case "ie":
		          //   driver = initIEDriver();
		            // break;

		        case "chrome":
		             driver = initChromeDriver();
		             break;

		             default:
		                 driver = initChromeDriver();
		                 break; 
		    }

		    driver.manage().window().maximize();        
		    driver.get(getData("URL"));
		    driver.manage().timeouts().implicitlyWait(Integer.parseInt(getData("WaitTime")), TimeUnit.SECONDS);
		
	}*/
	
	public static void chrome_browser() {	
		
		
		
}
}

