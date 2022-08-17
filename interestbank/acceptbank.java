package interestbank;

import java.util.Scanner;



public class acceptbank {
 long bank_balance=0;
 long account;
 long ph;
 String name;
 int pass;
 String bank_name="Lena dena Bank";
 Scanner ch=new Scanner(System.in);

public void accept_detail() {
	System.out.println("Enter your password ");
    pass=ch.nextInt();
    if(pass==1209) {
    	System.out.println("Enter your account holder name ");
    	name=ch.next();
    	System.out.println("Enter your account number ");
    	account=ch.nextLong();
    	System.out.println("Enter your phone number ");
        ph=ch.nextLong();
        
        System.out.println("Bank Name :"+bank_name);
        System.out.println("Account holder name :"+name);
        System.out.println("Phone number :"+ph);
        System.out.println("Your currant bank balance :"+bank_balance);
        
    }
    else {
    	System.out.println("none");
    }
}
}
