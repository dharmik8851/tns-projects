package interface_basic_demo;

public interface Child extends Parent{
	void print();
	
	
	public interface InnerChild {
		void innerPrint();
		default void hello() {
			System.out.println("hello i am default method");
		}
	}
}


