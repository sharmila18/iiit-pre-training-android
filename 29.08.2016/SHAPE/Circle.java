class Circle extends Shape{
	private double radius;
	Circle(){
		System.out.println("this is circle constructor");
	}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(double radius,String color, boolean filled){
		
		super(color,filled);
		//this(radius);
		this.radius=radius;
		
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public double getPerimeter(){
		return 3.14*radius*2;
	}
	public String toString(){
		return "circle area="+(3.14*radius*radius)+"perimeter="+ (3.14*radius*2);
	}
}
