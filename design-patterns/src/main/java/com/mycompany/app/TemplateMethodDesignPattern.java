package com.mycompany.app;
public abstract class TemplateMethodDesignPattern
{
	public abstract void selectBread();
	public abstract void chooseIngredients();
	public abstract void addToppings();
	public abstract void addCheese();
	public abstract void bakeAtTemp();
	public void make()
	{
		selectBread();
		chooseIngredients();
		addToppings();
		addCheese();
		bakeAtTemp();
	}
}
class SimplePizzaMaker extends TemplateMethodDesignPattern
{
	public void selectBread()
	{
		System.out.println("Selecting Bread...");
	}
	public void chooseIngredients()
	{
		System.out.println("Choosing ingredients...");
	}
	public void bakeAtTemp()
	{
		System.out.println("Baking at temperature...");
	}
	public void addToppings()
	{
		System.out.println("Adding Toppings...");
	}
	public void addCheese()
	{
		System.out.println("Adding Cheese...");
	}
}