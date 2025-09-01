import java.util.Scanner;
  public class pattern4{
	  public static void main(String[]args){
		  System.out.println("enter n:");
		  Scanner in = new Scanner(System.in);
		  int n = in.nextInt();
		  
		  for(int i=1;i<=n;i++){
			  for(int j=1;j<=n-i;j++){
				  System.out.print(" ");
			  }
			  for(int j=1;j<=2*i-1;j++){
				   System.out.print("*");
		  }
		    System.out.println("");
		  }
	  }
  }
		  