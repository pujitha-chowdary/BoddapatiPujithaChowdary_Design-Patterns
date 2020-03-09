package com.mycompany.app;
interface ShapeSubSystem
{
	String draw();
}
class Circle implements ShapeSubSystem
{
	public String draw()
	{
		return("Drawing a Circle..");
	}
}
class Square implements ShapeSubSystem
{
	public String draw()
	{
		return("Drawing a Square..");
	}
}
class Rectangle implements ShapeSubSystem
{
	public String draw()
	{
		return("Drawing a Rectangle..");
	}
}
class ShapeMakerFacade
{
	private ShapeSubSystem circle;
	private ShapeSubSystem rectangle;
	private ShapeSubSystem square;
	public ShapeMakerFacade()
	{
		this.circle=new Circle();
		this.square=new Square();
		this.rectangle=new Rectangle();
	}
	public String drawCircle()
	{
	    return this.circle.draw();
	}
	public String drawSquare()
	{
		return this.square.draw();
	}
	public String drawRectangle()
	{
		return this.rectangle.draw();
	}
}