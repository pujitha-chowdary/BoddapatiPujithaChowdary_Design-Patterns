package com.mycompany.app;
interface WebDriver
{
	public String getElement();
	public String selectElement();
}
class ChromeDriver implements WebDriver
{
	public String getElement()
	{
		return("Get element from ChromeDriver");
	}
	public String selectElement()
	{
		return("Select element from ChromeDriver");	
	}	
}
class IEDriver 
{
	public String findElement()
	{
		return("Find element from IEDriver");
	}
	public String clickElement()
	{
		return("Click element from IEDriver");
	}
}
class WebDriverAdapter implements WebDriver
{
	IEDriver ieDriver;
	public WebDriverAdapter(IEDriver ieDriver)
	{
		this.ieDriver=ieDriver;
	}
	public String getElement()
	{
		return ieDriver.findElement();
	}
	public String selectElement()
	{
		return ieDriver.clickElement();
	}
}