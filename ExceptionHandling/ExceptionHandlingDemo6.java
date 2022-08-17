package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingDemo6 {

	static Scanner ch=new Scanner(System.in);
		public static void main(String [] args){
			int a = 10, b;
			try{
					b =ch.nextInt();
					int ans = a/b;
					System.out.println("The ans is :" + ans);
			}
			catch(Exception e){
				System.out.println("Exception is Generated:" + e);
			}
			finally{
				System.out.println("Always Gets Executed");
			}
			System.out.println("After Try block");
		}
}
