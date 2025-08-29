/*
Prob 1:

Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2
*/

import java.util.Scanner;
  public class loop 
     {
	   public static void main(String[]args)
	   {
	     Scanner in = new Scanner(System.in);
		 
	     System.out.println("enter x :");
		 int x = in.nextInt();
		
         System.out.println("enter y :");
		 int y = in.nextInt();
		 
		 for(int i=0;i<y;i++)
		  {
		    System.out.println(x);
		  }
		}
	  }