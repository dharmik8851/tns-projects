package interface_demo;

public interface Bank {
	static final float MINBAL = 1000;
	static final float MAXBAL = 50000;
	public void deposit(float amount);
	public void withdraw(float amount);
}

