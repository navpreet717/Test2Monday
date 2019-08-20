import java.io.*; 
import java.util.Scanner;
public class Triangle extends Shape implements TwoDimensionalShape {
	 
private String color;
public Triangle(double base,double height,String color)
{
	this.base=base;
	this.height=height;
	this.color=color;

}
public void setColor(String color) {
	this.color = color;
}
public String getColor() {
	return color;
}

public void calculateArea()
{
	double area=	(base* height)/2;
	System.out.println("area of triangle is"+area);
	
	
}
public void printInfo()
{
	System.out.println("color of triangle is"+color);
	System.out.println("base of triangle is"+base);
	System.out.println("height of triangle is"+height);
}
      
	
}
