package object_cloning_abstract_demo;

public abstract class Shape {
	protected float area;
	
	Shape(){
		System.out.println("Constructor called");
	}
	
	public abstract void calArea();
	
	//solid 
	void show() {
		System.out.println("Area of shape is : " + area);
	}
}

class Square extends Shape{
	
	float side;
	
	public Square() {
		side = 2.0f;
	}
	
	public Square(float side){
		this.side = side;
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		area = side*side;
	}
	
}


class Rectangle extends Shape{
	float height=3.0f,width=5.0f;
	
	public Rectangle() {
		super();
	}


	public Rectangle(float height, float width) {
		this.height = height;
		this.width = width;
	}


	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		area = height * width;
	}
	
}