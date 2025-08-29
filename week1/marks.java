/*
Given mark of student, Print the Grade

Grade A if mark is greater than or equal to 90

Grade B if mark is greater than or equal to 80

Grade C if mark if greater than or equal to 60

Grade D if mark if greaer than or equal to 35

Fail if mark is lesser than 35


Input: 95

Expected Output:

Grade A
*/

import java.util.Scanner;
public class marks
     {
	   public static void main(String[]args)
	    {
		  System.out.println("enter student mark :");
		  Scanner in = new Scanner(System.in);
		  int mark=in.nextInt();
		  
		    if(mark>=90)
			 {
			   System.out.println("student has secured A grade");
			 }
			 else if(mark>=80)
			 {
			   System.out.println("student has secured B grade");
			 }
			 else if(mark>=60)
			 {
			   System.out.println("student has secured C grade");
			 }
			 else if(mark>=35)
			 {
			   System.out.println("student has secured D grade");
			 }
			 else if(mark<35)
			 {
			   System.out.println("student has FAILED");
			 }
			 else
			 {
			   System.out.println("invalid input");
			 }
		}
	 }

		
 