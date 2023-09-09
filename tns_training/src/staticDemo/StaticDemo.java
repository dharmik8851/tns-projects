package staticDemo;

public class StaticDemo {
	static int a = 30;
	int b = 50;
	
	static void print() {
		System.out.println("a = " + a);
		//System.out.println("b = " + this.b);
	}
	
	void printA() {
		System.out.println("a = " + a);
	}

	@Override
	public String toString() {
		return "StaticDemo [b=" + b + "] + a="+a;
	}

}

class Executor{
	public static void main(String a[]) {
		StaticDemo.print();
		new StaticDemo().printA();
		System.out.println(new StaticDemo());
	}
}