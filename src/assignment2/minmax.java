package assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		int i,n,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("enter the values");
	    for(i=0;i<n;i++)
	    {
	    	a[i] = s.nextInt();
	    }	
		Arrays.sort(a);
	System.out.println("maxnum" + " " + a[n-1] + " " + "minnum" + " " + a[0]);
	c = a[n-1]-a[0];
	System.out.println("the difference is " + c);
	
	}

}
