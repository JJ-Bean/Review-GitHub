import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int num1;
		System.out.print("Pick an int: ");
		num1 = kb.nextInt();
    System.out.println("Todays lucky number is "+ num1);
  }
}