/*
Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


Input:  2 Name y

Expected Output:

2

Name

y
*/
import java.util.Scanner;
public class scann
{
public static void main(String[]args)
{
Scanner in= new Scanner(System.in);

System.out.println("enter a integer :");
int integer=in.nextInt();

System.out.println("enter a String :");
String str=in.next();

System.out.println("enter a character :");
char Ch=in.next().charAt(0);

System.out.println(integer);
System.out.println(str);
System.out.println(Ch);
}
}