package assignment2;
import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		
		String original, reverse = "";
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		original = s.nextLine();
		int length = original.length();
		
		for(i=length-1;i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		
		
		if(original.equals(reverse))
		{
			System.out.println("This is a palindrome");
		}
		else
		{
			System.out.println("It isn't a palindrome");
		}
		
		

	}

}
