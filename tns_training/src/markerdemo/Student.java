package markerdemo;


class Demo implements Cloneable{
	int i,j;
	
	Demo(int i, int j){
		this.i=i; this.j=j;
	}
	
	public Demo clone() throws CloneNotSupportedException{
		return (Demo)super.clone();
	}

	@Override
	public String toString() {
		return "Demo [i=" + i + ", j=" + j + "]";
	}
	
}

public class Student{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		isRegistred ir = (a,c) ->(a+c);
		
//		isRegistred ir = (int a, int c) -> {
//			System.out.println("this is lambda expression");
//			return a+c;
//		};
		
//		isRegistred ir = new isRegistred(){
//			public int isValid(int a, int c) {
//				System.out.println("hello i am anonymuse inner class");
//				return a+c;
//			}				
//		System.out.println(ir.isValid(340,4560));	
		
		Demo obj = new Demo(10,20);
		Demo obj2 = (Demo)obj.clone();
		obj2.j=3456;
		System.out.println(obj2);
		System.out.println(obj);
	}

}
