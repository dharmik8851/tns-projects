package ThreadDemo;

class FirstThread implements Runnable{
	Thread t;
	String msg;
	int end,start;
	
	

	public FirstThread(String msg, int end, int start) {
		this.msg = msg;
		this.end = end;
		this.start = start;
		t = new Thread(this, "First Thread");
		t.start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=end; i>=start; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
			System.out.println(i+msg);
		}
	}
	
}

class SecondThread extends Thread{
	int n; 
	String msg;
	
	public SecondThread(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}
	
	@Override
	public void run(){
		for(int i=1; i<=n; i++) {
			try {
			Thread.sleep(1000);
			}catch(InterruptedException ie) {
				System.err.println(ie);
			}
			System.out.println(i+msg);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		SecondThread st = new SecondThread(5,"hello i am in right path");
		st.start();
		FirstThread ft = new FirstThread("i am First Thread",5,1);
		Thread.sleep(5000);
		Runnable ru = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("annonymus class");
			}
			
		};
		new Thread(ru).start();
		
		Runnable ru2 = () -> {System.out.println("lamda is mine");
			System.out.println("hello i am again lamda");};
		new Thread(ru2).start();
		
		System.out.println("End of the program");
	}
}
