package testing;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class TestJunit {
	//Initialize all the variables  
     private Integer inputNumber;
     private Boolean expectedResult;
     private PrimeNumberMethod logic;

     @Before
     public void initialize() {
        logic = new PrimeNumberMethod();
     }

     public TestJunit(Integer inputNumber, 
    		 //We have to determine whether the number is an prime number or not 
        Boolean expectedResult) {
    	 //Displays the output
       System.out.println("TestJunit-> inputNumber:"+inputNumber+" expectedResult:"+expectedResult);
       //The number entered by the user 
        this.inputNumber = inputNumber;
        //After testing it 
        this.expectedResult = expectedResult;
     }

     @Parameterized.Parameters
     public static Collection primeNumbers() {
    	 //Displays the following
       System.out.println("primeNumbers() is called");
        return Arrays.asList(new Object[][] {
        	//The numbers which we are going to test
           { 12, true },
           { 4, false },
           { 17, true },
           { 24, false },
           { 21, true }
        });
     }

     @Test
     public void testPrimeNumberChecker() {
    	 //Displays the output
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult, logic.validate(inputNumber));
     }

}