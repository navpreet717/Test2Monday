
public class Square extends Shape implements TwoDimensionalShape {
	private String color;
	public Square(double side,String color)
	{
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void calculateArea()
	{
		double areaofSquare=	side*side;
		System.out.println("area of square  is"+areaofSquare);
	}
	public void printInfo()
	{
		System.out.println("color of square is"+color);
		System.out.println("height of each side is"+side);}
}
