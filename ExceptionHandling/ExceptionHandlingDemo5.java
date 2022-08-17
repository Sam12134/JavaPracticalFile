package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingDemo5 {
	static	Scanner ch=new Scanner(System.in);
	public static void main(String [] args){
		int a, b;
		try{
			a = ch.nextInt();
			b = ch.nextInt();
			if ((b <= 0) || (a <=0))
			throw new ArithmeticException();
			int ans = a/b;
			System.out.println("The answe is :" + ans);
		}
		catch(ArithmeticException e){
			System.out.println("Sorry we want both numbers to be Non-Zero Positive");
		}
	}
}
