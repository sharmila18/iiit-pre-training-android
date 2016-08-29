abstract class Shape{
	
	String color ;
	boolean filled;
	Shape(){
		System.out.println("this is shape constructor");
	}
	Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this. color=color;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setisFilled(boolean filled){
		this. filled=filled;
	}
	public abstract double getArea();
		
	
	public abstract double getPerimeter();
		
	
	public abstract String toString();
	
}
	
	
