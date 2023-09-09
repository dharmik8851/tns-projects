package com.dayfour.p1;

public class Base {
	int varDefault = 10;
	protected int varProtected = 20;
	private int varPrivate = 30;
	public int varPublic = 40;
	
	void methodDefault() {
		varPrivate = 500;
		System.out.println("default method" + varPrivate);
	}
	
	protected void methodProtected() {
		System.out.println("protected method");
	}
	
	private void methodPrivate() {
		System.out.println("private method"+ varPrivate);
	}
	
	public void methodPublic() {
		System.out.println("public method"+ varPublic);
	}
	
	
}
