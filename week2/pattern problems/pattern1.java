import java.util.Scanner;
  public class pattern1
     {
	   public static void main(String[]args)
	     {
		   Scanner in = new Scanner(System.in);
		   System.out.println("enter n :");
		   int n = in.nextInt();
		   
		   for(int i=1;i<=n;i++){
		     for(int j=1;j<=n;j++){
			    System.out.print(j+"   ");  
				              }
				System.out.println("");  
							}
		 }
	 }		 