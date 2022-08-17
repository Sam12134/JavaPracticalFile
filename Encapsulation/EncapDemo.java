package Encapsulation;

import java.util.Scanner;

public class EncapDemo {
   int h,e,his,geo,eco;
   int rollno;
   static float total;
   String name;
   Scanner ch = new Scanner(System.in);
   public void acceptValue() {
	
	System.out.println("Enter Student name ");
	name = ch.nextLine();
	
	System.out.println("Enter Student Roll number ");
	rollno=ch.nextInt();
	
	System.out.println("Enter Hindi Subject number ");
	h=ch.nextInt();

	System.out.println("Enter English Subject number ");
	e=ch.nextInt();

	System.out.println("Enter History Subject number ");
	his=ch.nextInt();

	System.out.println("Enter Geography Subject number ");
	geo=ch.nextInt();

	System.out.println("Enter Economics Subject number ");
	eco=ch.nextInt();
	
	System.out.println("The Student Name is : "+name);
	System.out.println("The Student  Roll No. is : "+rollno);
//	System.out.println("The Student Hindi Number is : "+h);
//	System.out.println("The Student English Number is : "+e);
//	System.out.println("The Student History Number is : "+his);
//	System.out.println("The Student Geography Number is : "+geo);
//	System.out.println("The Student Economics Number is : "+eco);
	
	total=h+e+his+geo+eco;
	System.out.println("The student tatal marks is "+total);

   }
}
