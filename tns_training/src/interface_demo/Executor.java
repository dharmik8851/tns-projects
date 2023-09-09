package interface_demo;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount("dharmik", "ahmedabad", 12345678);
		System.out.println(sa);
		sa.deposit(200);
		sa.withdraw(300);		
	}
}
