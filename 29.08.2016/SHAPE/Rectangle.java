class Rectangle extends Shape{
	double width;
	double length;
	Rectangle(){
		System.out.println("this is rectangle constructor");
	}
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		//this(width,length);
		this.width=width;
		this.length=length;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double getArea(){
		return length*width;
	}
	public double getPerimeter(){
		return 2*(width + length);
	}
	public String toString(){
		return "rectangle area="+(length*width)+"perimeter="+ (2*(width + length));
	}
}
