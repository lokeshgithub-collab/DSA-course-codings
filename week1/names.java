/*
Prob 3:

Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja
*/
import java.util.Scanner;
  public class names
     {
	   public static void main(String[]args)
	     {
		   Scanner in = new Scanner(System.in);
		   System.out.println("enter first name :");
		   String firstname = in.next();
		   
		   System.out.println("enter last name :");
		   String lastname = in.next();
		   
		   System.out.println("enter condition:");
		   int n = in.nextInt();
		   
		   String result= firstname+lastname;
		   
		   for(int i=0;i<n;i++)
		      {
				System.out.println(result);
			  }
		 }
	  } 