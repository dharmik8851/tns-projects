package day9_String_Demo;


public class Demo {
	public static void main(String[] args) {
		char c[] = {'d','h','a','r','m','i','k'};
		String s1 = "dharmik";
		String s2 = "dharmik";
		String s3 = new String(" Indian  ");
		
		System.out.println(s3.toUpperCase());
		System.out.println(s3.length());
		System.out.println(s3.substring(0));
		System.out.println(s3.trim());
		System.out.println(s3.isEmpty());
		System.out.println("compare method " + s2.compareTo(s1));
		System.out.println("equals "+s2.equals(s1));
		String s5 = "patel";
		String s4 = new String("dharmik");
		System.out.println(s4 == s5);
		System.out.println(s4.compareTo(s5));
		//hashcode
		String s6 = new String("dharmik");
		System.out.println(s4.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s6.hashCode());
	}
}