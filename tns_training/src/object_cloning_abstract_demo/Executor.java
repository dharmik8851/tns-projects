package object_cloning_abstract_demo;

public class Executor {
	public static void main(String args[]) throws CloneNotSupportedException {
		Student2 s = new Student2(1, "BE", 100);
//		s.setClassName("its my own");
//		System.out.println(s);
//		s.hello();
		
		Student s2 = (Student)s.clone();
//		Student s2 = s;
		s2.setClassName("Dharmik");
		System.out.println(s);
		System.out.println(s2);
		
//		Shape s;
//		s = new Square();
//		s.calArea();
//		s.show();
//		
//		s = new Rectangle();
//		s.calArea();
//		s.show();
	}
}
