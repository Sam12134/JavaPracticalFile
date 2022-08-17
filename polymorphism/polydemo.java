package polymorphism;

import java.util.Scanner;

public class polydemo {
	 static Scanner sc= new Scanner(System.in);
	static int size;
	static int i;
	static int sum=0;
 public static void add() {
	 
 }
 
 public static int add(int[] num) {
	 for(i=0;i<size;i++) {
		 sum=sum+num[i];
	 }
	 System.out.println("The aize of the array "+sum);
	 return sum;
 }
 
 public static int add(int n1,int n2) {
	 return n1+n2;
	 
 }
 public static double add(double n1,double n2) {
	 return n1+n2;
 }
 
 public static void accept() {
	 int n1,n2;
	 double a1,a2;
	 int[] arr;
	 System.out.println("Enter the sie ");
	 size=sc.nextInt();
	 arr=new int[size];
	 System.out.println("Enter "+size+" number");
	 for( i=0;i<size;i++) {
		 arr[i]=sc.nextInt();
		 
	 }
//	 add(arr);
	 System.out.println("The sum of array number ="+add(arr));
	 System.out.println("Enter two number ");
	 n1=sc.nextInt();
	 n2=sc.nextInt();
	 System.out.println("The sum of two number ="+add(n1,n2));
	 System.out.println("Enter two number");
	 a1=sc.nextDouble();
	 a2=sc.nextDouble();
	 System.out.println("The sum of two number ="+add(a1,a2));
 }
 public static void main(String args[]) {
	 accept();
 }
 
}
