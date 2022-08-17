package interestbank;

public class interst extends acceptbank {
  long withdrawal,deposit;
  double principal_amount,time_of_duration,rate_of_interest;
  double total;
  int i,count=1;
  char alpha;
  
  public long with(long withdrwal) {
	  this.withdrawal=withdrwal;
	  bank_balance-=withdrwal;
	  return bank_balance;
  }
  public void with_print() {
	  long with;
	  System.out.println("Withdrawal your money :");
	  with=ch.nextLong();
	  System.out.println("The total bank balance is :"+with(with));
  }
  public long depo(long deposit) {
	  this.deposit=deposit;
	  bank_balance+=deposit;
	  return bank_balance;
  }
  public void depo_print() {
	  long depo;
	  System.out.println("Deposit your money :");
	  depo=ch.nextLong();
	  System.out.println("The total bank balance is :"+depo(depo));
  }
  
  
  public void interst_details() {
	  System.out.println("The Interst on Educ{ation loan 5% ");
	  System.out.println("The Interst on Bussiness loan 7% ");
	  System.out.println("The Interst on Farmer loan 4% ");
	  System.out.println("The Interst on StartUp Bussiness loan 10% ");
	  System.out.println("The Interst on Home loan 8% ");
  }
  
  
  
	
}
