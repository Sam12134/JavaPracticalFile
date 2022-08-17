package ExceptionHandling;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        demo2 obj = new demo2();
        obj.use_of_multi();
	}
	int num1,num2,num3,res;
	Scanner ch=new Scanner(System.in);
	public void use_of_multi() {
		try {
			System.out.println("Enter two number ");
			num1=ch.nextInt();
			num2=ch.nextInt();
			res=num1/num2;
			System.out.println("The div is "+res);
			int[] arr=new int[5];
			arr[8]=89;
			System.out.println("The array length "+arr[8]);
			String demo=null;
			System.out.println("Length "+demo.length());
		}
		catch(ArithmeticException ae) {
			System.out.println("Second no cannot be zero");	
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("MSG "+ar.getMessage());
		}
		catch(Exception e) {
			System.out.println("MSG "+e.getMessage() );
		}
	}
}
