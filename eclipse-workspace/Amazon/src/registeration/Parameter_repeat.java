package registeration;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import utility.Util_functions;


/*
2nd step, in the class name declare the public variable  which will include the values needs to be repeated 
Declare the same variables which needs to repeated in the class which has a test 

3rs step
public parameterziedTEstcasae(Str username Str password){
this. globalvariable = same name local variable which is declared within the method
this.username =username
this.......

//4th step

@Parameter
public static Collection input(){
	 return Arrays.asList(new Object[][] {{"FBro"},{"CBro"}});
	*/ 
	 


//1st step. Parameterzied class
	 @RunWith(Parameterized.class)
public class Parameter_repeat extends RegBase{
		 //Browser variable to capture the current browser from the arrays list 
		 //This will get the browser name 
		 public String Bro_name;
		 
		 //Make a constructor of the method Bro_name
		 public Parameter_repeat(String Bro_name){
			 /*Left side of the variable is the global and the the one which is declared in the constructor's 
			 Parnthesis is the local varibale by adding THIS we are making global and local varibale value equal to each other */
			 this.Bro_name=Bro_name;
		 }
		 
		 @Parameters
		 //Collection is an interface  adn there are build in classes in it
		 public static Collection<Object[]> getBrowser(){
			 //I want to have browser's key in the arralist so that 
			 //row - number of times u want to repeat test
			 //column- number of parameters u want to pass
			 Object [][] data= new Object [2][1];
			 
			 //1st row
			 data [0][0] = "Firefox";
			 data [1][0] = "Chrome";
			 //data [0][2] = CONFIG.setProperty("FBro", "Internet Explorer");
			 
			 return Arrays.asList(data);
			 
		 }
		 
		 @Test
		 public void Loadall_Browsers() {
				Util_functions.load_lookersGrp();
			 
		 }
		 
	 }

	
	
	

	 
	 
	
	 
	 
	 

