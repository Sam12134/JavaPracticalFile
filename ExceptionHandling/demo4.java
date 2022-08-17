package ExceptionHandling;

import java.util.Scanner;

public class demo4  {
	int n1;
	Scanner sc=new Scanner(System.in);
	public static void main(String abc[])
	{
		demo4 obj=new demo4();
		obj.call_demo();
	}
	
	public void call_demo()
	{
		try
		{
			System.out.println("Enter a number");
			n1=sc.nextInt();
			if(n1>0)
			{
//				throw new user_def_exp("It is Positive");
			}
			else
			{
//				throw new user_def_exp("It is Negative");
			}
		}
		catch(Exception e)
		{
			System.out.println("MSG:"+e.getMessage());
		}
	}
}
//public class user_def_exp extends Exception
//{
//	user_def_exp(String msg)
//	{
//		super(msg);
//	}
	
//}
//}
