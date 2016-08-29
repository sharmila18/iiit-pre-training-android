class Square extends Rectangle{
	double side;
	Square(){
		System.out.println("this is square constructor");
	}
	Square(double side){
		this.side=side;
	}
	Square(double side,String color, boolean filled){
		this.color=color;
		this.filled=filled;
		//this(side);
		this.side=side;
	}
	public double getSide(){
		return side;
	}
	public void setSide(double side){
		this.side=side;
	}
	
	public void setWidth(double side){
		this.width=side;
	}
	
	public void setLength(double side){
		this.length=side;
	}
	public String toString(){
		return "square area="+(length*width)+"perimeter="+ (2*(width + length));
	}
}
