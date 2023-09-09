package ExceptionDemo;
import java.util.Scanner;

class NegativeValueException extends Exception{
	NegativeValueException(String msg){
		super(msg);
	}
}

class GreaterValueException extends Exception{
	GreaterValueException(String msg){
		super(msg);
	}
}

public class UsingThrow {
	
	static void acceptNumber(){
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		
		//inbuild exception
//		try {
//			if(no<0) throw new Exception("Percentage should not be negative");
//			else if(no>100) throw new Exception("Percentage should not be greater than  100");
//			else System.out.println("Valid Successfully");
//		}
//		catch(Exception e) {
//			System.err.println(e.getMessage());
//			System.err.println(e.getClass().getName());
//		}
		
		//user defined exception
		try {
			if(no<0) throw new NegativeValueException("Percentage should not be negative");
			else if(no>100) throw new GreaterValueException("Percentage should not be greater than  100");
			else System.out.println("Valid Successfully");
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			System.err.println(e.getClass().getName());
		}
		
	}
	
	public static void main(String[] args){
		System.out.println("enter nos");
		acceptNumber();
	}
}
