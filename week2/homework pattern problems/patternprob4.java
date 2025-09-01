/*Write a Program that takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 8

Expected output:

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 */

import java.util.Scanner;
public class patternprob4{
	public static void main(String[]args){
		
		System.out.println("enter n :");
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 
		int count=1;
		for(int i=1;i<=n;i++){
			 for(int j=1;j<=i;j++){
				  System.out.print(count);
			 }
			  count++;
			  System.out.println("");
	 }
   }
}	