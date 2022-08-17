package interfaceProgram;

import java.util.Scanner;

public interface intclass {
	public void sod();
	
    Scanner ch=new Scanner(System.in);

	public static void check() {
		 int num,r,sum=0;
	        System.out.println("Enter a number ");
	        num = ch.nextInt();
	        do{
	            r=num%10;
	            sum=sum+r;
	            num=num/10;

	        }
	        while(num>0);
	        System.out.println("The sum of digit is = "+sum);
	}
	

}
