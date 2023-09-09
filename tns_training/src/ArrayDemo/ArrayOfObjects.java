package ArrayDemo;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] obj = new Student[3];
		for(int i=0; i<obj.length; i++) {
			obj[i] = new Student(i+1, "dharmik"+i);
		}
		
		for(Student stu : obj) {
			System.out.println(stu.toString());
		}
	}

}
