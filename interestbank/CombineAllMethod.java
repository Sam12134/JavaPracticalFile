package interestbank;

public class CombineAllMethod extends interst{
 
	
	public void bussinessloan() {
		checkinterest();
		total=(principal_amount*7*time_of_duration)/100;
		  rate_of_interest = (total/time_of_duration)/12;
		  System.out.println("Your Pricipal Amount "+principal_amount);
			 System.out.println("Your Rate of interest on Principal Amount : 7%"); 
			 System.out.println("Your monthly EMI Pay "+rate_of_interest);
			 System.out.println("your time duration on principal amount : "+time_of_duration);
		     System.out.println("Your total interest loan is  "+total);
	}
	public void farmerloan() {
		checkinterest();
		  total=(principal_amount*4*time_of_duration)/100;
		  System.out.println("Your Pricipal Amount "+principal_amount);
			 System.out.println("Your Rate of interest on Principal Amount : 4%"); 
			 System.out.println("your time duration on principal amount : "+time_of_duration);
		     System.out.println("Your total interest loan is  "+total);
	}
	public void bussinessstartuploan() {
		checkinterest();
		total=(principal_amount*10*time_of_duration)/100;
		  System.out.println("Your Pricipal Amount "+principal_amount);
		  rate_of_interest = (total/time_of_duration)/12;
			 System.out.println("Your monthly EMI Pay "+rate_of_interest);
			 System.out.println("Your Rate of interest on Principal Amount : 10%"); 
			 System.out.println("your time duration on principal amount : "+time_of_duration);
		     System.out.println("Your total interest loan is  "+total);
	}
	public void homeloan() {
		checkinterest();
		total=(principal_amount*8*time_of_duration)/100;
		  System.out.println("Your Pricipal Amount "+principal_amount);
		  rate_of_interest = (total/time_of_duration)/12;
			 System.out.println("Your monthly EMI Pay "+rate_of_interest);
			 System.out.println("Your Rate of interest on Principal Amount : 8%"); 
			 System.out.println("your time duration on principal amount : "+time_of_duration);
		     System.out.println("Your total interest loan is  "+total);
	}
	public void educationloan() {
		checkinterest();
		total=(principal_amount*5*time_of_duration)/100;
		  System.out.println("Your Pricipal Amount "+principal_amount);
		  rate_of_interest = (total/time_of_duration)/12;
			 System.out.println("Your monthly EMI Pay "+rate_of_interest);
			 System.out.println("Your Rate of interest on Principal Amount : 5%"); 
			 System.out.println("your time duration on principal amount : "+time_of_duration);
		     System.out.println("Your total interest loan is  "+total);
	}
	
	
	public void checkinterest() {
		  System.out.println("choose which you like to take loan on 1: bussiness, 2: Education, 3: Farmer, 4:Bussiness Startup, 5: Home");
		  i=ch.nextInt();	
		
		  System.out.println();
		  System.out.println("Enter the Principal Amount : ");
		  principal_amount=ch.nextDouble();
//		  System.out.println("Enter the Rate of interest on Principal Amount : ");
//		  rate_of_interest=ch.nextLong();
		  System.out.println("Enter the Time Duration for Principal Amount in year: ");
		  time_of_duration=ch.nextDouble();
	}
	
	public void moneycondition() {
		interst_details();
		
		if(bank_balance<=50000 && bank_balance>=0) {
			System.out.println("Your total balance less than 50000 "+bank_balance);
			System.out.println("Now We not have any interest loan offer for you");
			System.out.println("Plz Comen Again :-)");
		}
		else if(bank_balance<=150000 && bank_balance>=50000) {
			do {
				
				  if(i==1) {
					educationloan();
				  }  
				  else if(i==2) {
					 farmerloan();
				  }
				  else if(i==3) {
					  homeloan();

				  }
				  else {
					  System.err.println("Plz reinter your option");
				  }
				  
			}while(alpha=='y' || alpha=='Y');
			  System.out.println("Welcome to come Lena Dena Bank -:) Plz Come Again");

		}
		else if(bank_balance<=250000 && bank_balance>=150000) {
			do {
				
				  if(i==1) {
					  educationloan();

				  }  
				  else if(i==2) {
						 farmerloan();				  
						 }

				  else if(i==3) {
					  homeloan();

				  }
				  else if(i==4) {
					  bussinessloan();

				  }
				  else {
					  System.err.println("Plz reinter your option");
				  }
				  
			}while(alpha=='y' || alpha=='Y');
			 System.out.println("Welcome to come Lena Dena Bank -:) Plz Come Again");

		}
	
		else if(bank_balance>=250000) {
			 do {
				 	
				  if(i==1) {
					  bussinessloan();
				  }  
				  else if(i==2) {
					  educationloan();
				  }
				  else if(i==3) {
					 farmerloan();				  }
				  else if(i==4) {
					  bussinessstartuploan();
				  }
				  else if(i==5) {
					  homeloan();
				  }
				  else {
					  System.err.println("Plz reinter your option");
				  }
				 
				 
				  System.out.println("You want to continue this process Y/N");
				  alpha=ch.next().charAt(0);
					  
					  
			  }while(alpha=='y' || alpha=='Y');
			  System.out.println("Welcome to come Lena Dena Bank -:) Plz Come Again");
			 
		}
		
	}
}
