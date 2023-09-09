package interface_demo;

public class SavingAccount extends Customer implements Bank{
	private float balance = Bank.MINBAL;
	
	

	public SavingAccount(String name, String city, int accNo) {
		super(name, city, accNo);	
	}
	
	

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ ", getAccNo()=" + getAccNo();
	}



	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		if(balance + amount > Bank.MAXBAL) {
			System.out.println("Transaction Cancelled \n You Exceed Maximum limit of Deposit");
		}
		else {
			balance += amount;
			System.out.println("Your Transaction Successfull. \n account balance " + balance);
		}
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(balance - amount < Bank.MINBAL) {
			System.out.println("Transaction Cancelled \n Minimum " + Bank.MINBAL + " required in your account");
		}
		else {
			balance -= amount;
			System.out.println("Your Transaction Successfull. \n account balance " + balance);
		}
	}
	
	

}
