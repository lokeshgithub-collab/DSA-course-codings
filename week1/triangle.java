import java.util.Scanner;
public class triangle
 {
   public static void main(String[]args)
    {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("enter angle1 :");
	  int a = in.nextInt();
	  
	  System.out.println("enter angle2 :");
	  int b = in.nextInt();
	  
	  System.out.println("enter angle3 :");
	  int c = in.nextInt();
	  
	  if(a+b+c==180)
	   {
	     System.out.println("triangle can be formed");
	   }
	   else
	   {
	     System.out.println("triangle cannot be formed");
	   }
	}
 }