package registeration;

import java.io.IOException;


import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Util_functions;


//@Beforeclass :  This is used if we have two tests int the class and we want something excuted before running both Tests then we'll use BeforeClass annotation rather than @Before
/*Skip the test case without using @Ignore by using Assume.assumeTrue(False) the method in the paranthesis if it'll execute successfully then the assume condition will be passed otherwise it is not true and it'll be skipped
this will stop the execution of this test where ever it is declared 

Assertions can be used instead of if statements Assert.assertEquals(expected and actual value) the only thing is if the assertion fails then the rest of the test case won't be executed
 to let the rest of the test case add in the try and catch block try{
 																	}catch(Throwable t){
 																	code to REPORT OR COLLECT an error via ErrorCollector with annotation@Rule errorCollector.addError(t);
 																	}
 
*/


public class Lookers_env extends RegBase{

	//some reason can't add Before Test annotation
	@BeforeMethod
	public void BeforeTest() throws Throwable{

		}
		
		
	@Test
	public void LoginTest() throws IOException {
	
		Util_functions.load_lookersGrp();
	}
		
		
		
		
		
		
		
		//	String[] Keys = {"FBro","CBro","IEBro","EdgeBro","SafariBro"};
	
		//DR.get(CONFIG.getProperty("site"));
		//Declare an array an put all the key of the browsers in an array, Turn that array into the List and then call the list and everytime the list is called the Load method has been run and the result will be capture
	
		
		
		//while(EnuKeys.hasMoreElements()) {
			
			//String Value= CONFIG.getProperty(Key);
			//System.out.println(Value);
		/*try {
			 //while(Key.endsWith("Bro")){
				 //Key.equals("CBro");
			Assert.assertEquals(Key, Key);
			String i;
			
			for(i=Key;Key.length();Key++) {
				 Util_functions.page_load();
				System.out.println("");
			
			}
		}catch(Throwable t) {
		*/	
			
			
			
			
		
			
	
	
	/*@Parameters	
	public static Collection<Object[]> getData(){
		Object[] All_Browser = new Object[5];
		
		All_Browser[0] ="FBro";
		All_Browser[1] ="CBro";
		All_Browser[2] ="IEBro";
		All_Browser[3] ="EdgeBro";
		All_Browser[4] ="SafariBro";
		
	}*/
	
	@AfterTest
	public void close(){
		//Driver.close();
		
		System.out.println("Close the browser");
	}
	
	/*
	public static boolean checklogin(){
		return false;//if the login is not successful or true if successful
	}
	@Test
	public void signin(){
		System.out.println("User successfully singed in");
	}
	
	@Test
	public void guestaccess(){
		
	System.out.println("Continuing as a guest");
	}*/
}
