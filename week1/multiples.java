/*
Prob 2:

Write a program to take x and print multiples of x till 1000.

Input:

100

Expected Output:

100

200

300

400

500

600

700

800

900

1000
*/

import java.util.Scanner;

  public class multiples
    {
	  public static void main(String[]args)
	   {
	     System.out.println("enter x :");
		 Scanner in = new Scanner(System.in);
		 int x = in.nextInt();
		 
		 for(int i=x;i<=1000;i=i+x)
		   {
		     System.out.println(i);
		   }
		}
	}	