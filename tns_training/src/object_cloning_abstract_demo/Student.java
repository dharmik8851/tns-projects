package object_cloning_abstract_demo;


public abstract class Student implements Cloneable{
	int rollNO;
	String className;
	int id;
	
	public abstract void hello();
	
	
	
	
	public Student(int rollNO, String className, int id) {
		super();
		this.rollNO = rollNO;
		this.className = className;
		this.id = id;
	}
	//getter & setter
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", className=" + className + ", id=" + id + "]";
	}
	
	@Override
	public Student clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Student)super.clone();
	}
	
	
}

class Student2 extends Student{

	public Student2(int rollNO, String className, int id) {
		super(rollNO, className, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello my name is dhrmik");
	}

}
