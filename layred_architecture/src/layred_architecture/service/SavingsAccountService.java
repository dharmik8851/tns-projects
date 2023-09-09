package layred_architecture.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import layred_architecture.dao.DBUtil;
import layred_architecture.entities.SavingsAccount;

public class SavingsAccountService {
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private Connection cn = null;
	
	public SavingsAccountService() {
		cn = DBUtil.getConnection();
	}
	
	//get account details
	public SavingsAccount get(int accNo) {
		SavingsAccount sa = null;
		try {
			if(validateAccount(accNo)) {
				ps = cn.prepareStatement("select * from savingaccount where accNo=?");
				ps.setInt(1, accNo);
				rs = ps.executeQuery();
				if(rs.next()) {
					sa = new SavingsAccount(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("failed to fetch data");
		}
		return sa;
	}
	
	//validate account no
	public boolean validateAccount(int accNo) {
		boolean status=false;
		try {
			ps = cn.prepareStatement("select balance from savingaccount where accNo=?");
			ps.setInt(1, accNo);
			rs = ps.executeQuery();
			if(rs.next()) {
				status=true;
			}
			else {
				System.out.println("account does not exist");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("unable to fetch data");
		}
		return status;
	}
	
	//get balance
	public int getBalance(int accNo) {
		int balance = -1;
		try {
			if(validateAccount(accNo)) {
				ps = cn.prepareStatement("select balance from savingaccount where accNo=?");
				ps.setInt(1, accNo);
				rs = ps.executeQuery();
				if(rs.next()) {
					balance=rs.getInt(1);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("failed to fetch data");
		}
		return balance;
	}
	
	//withdraw money
	public void withdraw(int accNo, int amount) {
		int balance = getBalance(accNo);
		if(balance != -1) {
			try {
				if((balance-amount) < 1000) {
					throw new Exception("insufficient balance to withdraw");
				}else {
					balance = balance-amount;
					ps = cn.prepareStatement("update savingaccount set balance=? where accno=?");
					ps.setInt(1, balance);
					ps.setInt(2, accNo);;
					int i = ps.executeUpdate();
					System.out.println(i + " row is updated");
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	//deposit money
	public void deposit(int accNo, int amount) {
		int balance = getBalance(accNo);
		if(balance != -1) {
			try {
				if(amount > 25000) {
					throw new Exception("daily deposit limit exceeds");
				}else {
					balance = balance+amount;
					ps = cn.prepareStatement("update savingaccount set balance=? where accno=?");
					ps.setInt(1, balance);
					ps.setInt(2, accNo);;
					int i = ps.executeUpdate();
					System.out.println(i + " row is updated");
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
}
