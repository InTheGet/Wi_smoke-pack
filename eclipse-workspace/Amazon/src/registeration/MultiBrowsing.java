package registeration;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	import org.openqa.selenium.ie.InternetExplorerDriver;

	import org.testng.annotations.AfterClass;

	import org.testng.annotations.BeforeClass;

	import org.testng.annotations.Parameters;

	import org.testng.annotations.Test;

	public class MultiBrowsing {

		public WebDriver driver;

	  @Parameters("browser")

	  @Test

	  // Passing Browser parameter from TestNG xml

	  public void Test(String browser) {

	  // If the browser is Firefox, then do this

	  if(browser.equalsIgnoreCase("firefox")) {
		
		  System.setProperty("webdriver.gecko.driver",  "//Users//pradumanmehta///eclipse-workspace///Amazon//geckodriver");
			
			driver = new FirefoxDriver();

	   //If browser is chrome , then do this	  

	  }else if (browser.equalsIgnoreCase("chrome")) { 

		  // Here I am setting up the path for my IEDriver
		  //NEED TO FIND THE DRIVER FOR THE MAC IE

		  System.setProperty("webdriver.chrome.driver",  "//Users//pradumanmehta///eclipse-workspace///Amazon//chromedriver");
		  driver = new ChromeDriver();
} 

	  	  driver.manage().window().maximize();
		  driver.get("https://web-lookers-sit.lookers.uk/");
		  driver.getWindowHandle();

	  }

	  // Once Before method is completed, Test method will start

	  /*@Test public void login() throws InterruptedException {

		driver.findElement(By.xpath(".//*[@id='account']/a")).click();

	    driver.findElement(By.id("log")).sendKeys("testuser_1");

	    driver.findElement(By.id("pwd")).sendKeys("Test@123");

	    driver.findElement(By.id("login")).click();

		}  */

	  @AfterClass public void afterTest() {

			driver.quit();

		}

	}


