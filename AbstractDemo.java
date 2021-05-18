package myprogram.org;
abstract class Shape{
	private String color;
	abstract public double calculateArea();
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
}
class Circle extends Shape{
	public double calculateArea()
	{
		int r=5;
		double area=r*r*3.14;
		return area;
	}
	
}
class Square extends Shape{
	public double calculateArea()
	{
		int l=4;
		int b=4;
		double area=b*l;
		return area;
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Shape c=new Circle();
		Shape s=new Square();
		c.setColor("red");
		System.out.println("Area of circle is:"+c.calculateArea()+" and color is:"+c.getColor());
		s.setColor("red");
		System.out.println("Area of square is:"+s.calculateArea()+" and color is:"+s.getColor());
		

	}
	

}
