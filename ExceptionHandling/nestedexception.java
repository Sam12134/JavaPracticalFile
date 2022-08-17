package ExceptionHandling;

import java.util.Scanner;

public class nestedexception {
	int num1,num2,res;
	Scanner sc=new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nestedexception obj=new nestedexception();
		obj.nestedexcep();

	}
	public void nestedexcep() {
		try
		{
			System.out.println("Enter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
		
			res=num1/num2;
			System.out.println("The div is="+res);
			try
			{
				String demo=null;
				System.out.println("Lenght="+demo.length());
			}
			catch(Exception e)
			{
				System.out.println("MSG="+e.getMessage());
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("The second no cannot be zero");
		}
		finally 
		{
			System.out.println("This is my finally block :)");
	}

}
}
