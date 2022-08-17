package interestbank;

public class runmethod extends CombineAllMethod {
	public static void main(String args[]) {
	runmethod obj=new runmethod();
	obj.callAllMethod();
}
	
public void callAllMethod() {
int i;
char ans;
	do {
		System.out.println("Choose which you want to like 1:withdrawal 2:Deposit 3:Interest Loan 4:Bank Balance Check 5:Exit");
	    i=ch.nextInt();
	    
	    
	    switch(i) {
	    
	    case 1:
	    	with_print();
	    	break;
	    case 2:
	    	depo_print();
	    	break;
	    case 3:
	    	depo_print();
	    	checkinterest();
	    	break;
	    case 4:
	    	System.out.println("Your Total bank balance is"+bank_balance);
	    case 5:
	    	System.exit(i);
	    default:
	    	System.out.println("You input wrong value");
	    	
	    }
	    System.out.println("Would yoou like to cotinue this procss Y/N");
	    ans=ch.next().charAt(0);
	    
	}
	while(ans=='Y' && ans=='y'); 
	System.out.println("Thank you for come Lena Dena Bank");

}
}
