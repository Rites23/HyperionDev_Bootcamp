/* This program has an Array called ‘myTestResults’ that stores a list of results out of 100.
 * It will calculate the average grades based on the results
 * in my 'myTestResults'
 * */


package grades.java;

import java.util.Scanner;

public class Grades {


	    public static void main(String args[])
	    {
	    /* Array used for 5 TestResults */
	        int myTestResults[] = new int[5];
	        int i;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
			
	    /* We get the input from the user to enter 5 marks of the subjects */    
	        for(i=0; i<5; i++) { 
	           System.out.print("Please enter your marks? "+(i+1)+":");
	           myTestResults[i] = scanner.nextInt();
	           total = total + myTestResults[i];
	        }
	        scanner.close();
	   /* We then get the average for those 5 TestResults */ 
	        avg = total/5;
	        System.out.print("The Grade Achieved is: ");
	        if(avg>=80)
	        {
	            System.out.print("A");
	        }
	        else if(avg>=70 && avg<=79)
	        {
	           System.out.print("B");
	        } 
	        else if(avg>=60 && avg<=69)
	        {
	            System.out.print("C");
	        }
	        else if(avg>=50 && avg<=59)
	        {
	            System.out.print("D");
	        }
	        else if(avg<=49)
	        {
	            System.out.print("F"); 
	            System.out.println("\nThe average of Five Tests is : " + avg);
	            System.out.println("The total of Five Tests is   : " + total);
	            
	    }
	    }
}

