/*
Write a Program which takes input n and prints the below pattern and upload the code to your github repo.
Sample 1:

Input:

n = 4

Expected output:

****

***

**

*
-------------
*/
import java.util.Scanner;
  public class patternprob1{
	 public static void main(String[]args){
		 System.out.println("enter n :");
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 
		 for(int i=1;i<=n;i++){
			 for(int j=1;j<=n-i+1;j++){
				 System.out.print(j);
			 }
			 System.out.println("");
		 }
	 }
  }
  
		