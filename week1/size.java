/*
Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small

If size is 30 then its Medium

If size is 38 then its Large

If size is 42 then its XLarge

If size is not any of the above then Invalid.



Input: 29

Expected Output: 

Small
*/

import java.util.Scanner;
public class size
   {
     public static void main(String[]args)
	  {
	    System.out.println("enter size :");
		Scanner in= new Scanner(System.in);
		int size=in.nextInt();
		
		switch(size) {
		case 29 :
		  System.out.println("small");
		  break;
		case 30 :
		  System.out.println("medium");
		  break;
		case 38 :
		  System.out.println("large");
		  break;
		case 42 :
		  System.out.println("xlarge");
		  break;
		default :
		  System.out.println("invalid");
		             }
	   }
	} 