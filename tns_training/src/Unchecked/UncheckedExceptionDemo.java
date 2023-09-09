package Unchecked;

import java.util.Arrays;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		int a[]=null;
		String str = "DHA";
		String str2 = null;
		try {
		try {
			System.err.println(str2);
		try {
			System.out.println(str.charAt(3));
		}catch(StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}		
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}

//		try {
//			System.out.println(a);
//			a = new int[5];
//			System.out.println(a[5]);
//		}catch(NullPointerException e) {
//				System.out.println("variable can not point to null");
//		}
//
//		catch(Exception e) {
//				System.err.println("can't access index" + e.getMessage());
//		}
		
		System.out.println("hello my name is dharmik");
	}
}
