
public class Shape {
	protected double base;
	protected double height;
	public double side;
	
	public void Shape(double base,double height,double side)
	{
		this.base=base;
		this.height=height;
		this.side=side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
