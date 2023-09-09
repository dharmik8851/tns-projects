package day9_String_Demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer st = new StringBuffer("dharmik");
		System.out.println(st.length());
		System.out.println(st.capacity());
		
		System.out.println(st.append("patel"));
		//it append to the end of string and also return.
		String s;
		st = new StringBuffer(40);
		System.out.println(st.capacity());
		s=st.append("hello").append(23).append("dharmik").toString();
		System.out.println(s);
		st.insert(5,"like");
		System.out.println(st);
		st.delete(5, 9);
		System.out.println(st);
		st.reverse();
		System.out.println(st);
		int a=20;
		Integer b = 56787; //auto boxing
		int c = b; //unboxing
		System.out.println(a + b + c);
	}

}
