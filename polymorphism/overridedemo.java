package polymorphism;

import java.util.Scanner;

public class overridedemo {
   public void func1(int i) {
	   Scanner sc=new Scanner(System.in);
	   int num,f=1;
	   System.out.println("Enter a number ");
	   num=sc.nextInt();
	   while(num>0) {
		   f*=num;
		   num--;
		   
	   }
	   System.out.println("The factoriacl number is "+f);
	   
   }


}
