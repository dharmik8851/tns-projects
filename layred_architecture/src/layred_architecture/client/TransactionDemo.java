package layred_architecture.client;

import layred_architecture.entities.SavingsAccount;
import layred_architecture.service.SavingsAccountService;

public class TransactionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SavingsAccount sa;
			SavingsAccountService service = new SavingsAccountService();
			sa = service.get(1001);
			if(sa!=null) System.out.println(sa.toString());
			float balance;
			System.out.println("Is 1001 accno exists? " + service.validateAccount(1001));
			
			//withdrawing balance
			service.withdraw(1001, 200);
			sa = service.get(1001);
			if(sa!=null) System.out.println(sa);
			
			//deposit
			service.deposit(1001,4000);
			sa = service.get(1001);
			if(sa!=null) System.out.println(sa);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
