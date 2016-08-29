class TestShape{
	public static void main(String args[]){
		System.out.println("\nCIRCLE DETAILS");
		Circle c= new Circle();
		
		Circle c1= new Circle(5);
		System.out.println(c1.getRadius());
		c1.setRadius(20);
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		Circle c2= new Circle(2,"blue",true);
		System.out.println(c2.getColor());
		c2.setColor("VIOLET");
		System.out.println("modified color"+c2.getColor());
		System.out.println("filled?"+c2.isFilled());
		c2.setisFilled(false);
		System.out.println("filled?"+c2.isFilled());
		
		
		System.out.println("\nRECTANGLE DETAILS");
		
		Rectangle r= new Rectangle();
		Rectangle r1= new Rectangle(2,3);
		System.out.println("width "+r1.getWidth());
		r1.setWidth(10.9);
		System.out.println("mofiied width "+r1.getWidth());
		System.out.println("len"+r1.getLength());
		r1.setLength(20.3);
		System.out.println("modified len"+r1.getLength());
		System.out.println("area: "+r1.getArea());
		System.out.println("perimeter"+r1.getPerimeter());
		System.out.println(r1.toString());
		Rectangle r2= new Rectangle(2,3,"red",false);
		
		
		Square s = new Square();
		Square s1 = new Square(3);
		Square s2 = new Square(5,"green",false);
		
		System.out.println("\nSQUARE DETAILS");
		System.out.println("side "+s1.getSide());
		s1.setSide(16.9);
		System.out.println("modified side"+s1.getSide());
		
		s1.setLength(s1.getSide());
		System.out.println("modified len"+s1.getLength());
		s1.setWidth(s1.getSide());
		System.out.println("modified wid "+s1.getWidth());
		System.out.println("perimeter"+r1.getPerimeter());
		System.out.println(s1.toString());
	}
}
		
