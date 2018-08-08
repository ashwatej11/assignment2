package assignment2;
import java.util.Scanner;


public class fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c,i,n;
		Scanner s= new Scanner(System.in);
		System.out.print("enter the length");
		n=s.nextInt();
		System.out.print(a +" "+ b);
		for(i=2;i<=n;i++)
			{
			c=a+b;
			System.out.print(" " + c);
		
			a=b;
			b=c;
			
			}
			
		

	}

}
