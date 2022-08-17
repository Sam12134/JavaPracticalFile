package polymorphism;

import java.util.Scanner;

public class met_over1 extends overridedemo {
@Override		
public void func1(int size) {
	int n1=0,n2=1,temp;
	System.out.println(n1+"\n"+n2);
	size=size-2;
	do {
		temp=n1+n2;
		System.out.println(temp);
		n1=n2;
		n2=temp;
		size--;
	}while(size>0);
}
public static void main(String args[]) {
	overridedemo obj=new met_over1();
	overridedemo obj2=new overridedemo();
	
	
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	num=sc.nextInt();
	
	obj.func1(10);
	obj2.func1(2);
}
}
