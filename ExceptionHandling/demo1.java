package ExceptionHandling;

import java.util.Scanner;

public class demo1 {
 int num1,num2,res;
 public static void main(String args[]) {
	 demo1 op=new demo1();
	 op.division();
 }
 public void division() {
	 try {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number ");
	 num1=sc.nextInt();
	 num2=sc.nextInt();
	 res=num1/num2;
	 System.out.println("The div is :"+res);
	 res=num1+num2;
	 System.out.println("The add is : "+res);
	 }
	 catch(Exception e) {
		 System.out.println("The second no cannot be zero "+e.getMessage());
	 }
	 
 }
}
