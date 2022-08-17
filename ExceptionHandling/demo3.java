package ExceptionHandling;

import java.util.Scanner;

public class demo3 {
  int num;
  Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          demo3 obj=new demo3();
          obj.even_odd();
	}
	public void even_odd() {
		try {
		System.out.println("Enter a number");
		num=sc.nextInt();
		check_demo(num);
		}
	
	catch(Exception e) {
		System.out.println("MSG "+e.getMessage());
	}

	}
	public void check_demo(int num2) {
		if(num2%2==0) {
			throw new ArithmeticException("It is an even number ");
		}
		else {
			throw new ArithmeticException("It is an odd number ");
		}
	}
}
