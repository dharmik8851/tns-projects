package interface_basic_demo;

public class executor implements Child.InnerChild{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executor obj = new executor();
		obj.innerPrint();
		obj.hello();
		String str = "dharmik";
		
	}

	@Override
	public void innerPrint() {
		// TODO Auto-generated method stub
		System.out.println("i am inner interface");
	}

}
