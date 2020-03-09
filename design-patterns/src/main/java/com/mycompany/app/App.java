package com.mycompany.app;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
    public static void main(String[] args)
    {
    	final Logger LOGGER=LogManager.getLogger(App.class);
    	LOGGER.info("---Implementation of creational design patterns---");
    	LOGGER.info("");
    	LOGGER.info("Implementation of Singleton design pattern:");
		SingletonSynchronized instance=SingletonSynchronized.getInstance();
		LOGGER.info(instance);
		SingletonSynchronized instance1=SingletonSynchronized.getInstance();
		LOGGER.info(instance1);
		LOGGER.info("");
		
		LOGGER.info("Implementation of Builder design pattern:");
		Vehicle car=new Vehicle.VehicleBuilder("1500cc",4).setAirbags(4).build();
		Vehicle bike=new Vehicle.VehicleBuilder("250cc",2).build();
		LOGGER.info(car.getEngine());
		LOGGER.info(car.getWheel());
		LOGGER.info(car.getAirbags());
		LOGGER.info(bike.getEngine());
		LOGGER.info(bike.getWheel());
		LOGGER.info(bike.getAirbags());
		LOGGER.info("");
		
		
		LOGGER.info("---Implementation of structural design patterns---");
		LOGGER.info("");
		LOGGER.info("Implementation of Adapter design pattern:");
		ChromeDriver a=new ChromeDriver();
		LOGGER.info(a.getElement());
		LOGGER.info(a.selectElement());
		IEDriver e=new IEDriver();
		LOGGER.info(e.findElement());
		LOGGER.info(e.clickElement());
		WebDriver w=new WebDriverAdapter(e);
		LOGGER.info(w.getElement());
		LOGGER.info(w.selectElement());
		LOGGER.info("");
		
		LOGGER.info("Implementation of Facade design pattern:");
		ShapeMakerFacade smf=new ShapeMakerFacade();
		LOGGER.info(smf.drawCircle());
		LOGGER.info(smf.drawRectangle());
		LOGGER.info(smf.drawSquare());
		LOGGER.info("");
		
		LOGGER.info("---Implementation of Behavioural design patterns---");
		LOGGER.info("");
		LOGGER.info("Implementation of Template Method design pattern:");
		TemplateMethodDesignPattern cheeseCornMaker=new SimplePizzaMaker();
		cheeseCornMaker.make();
		LOGGER.info("");
		
		LOGGER.info("Implementation of Iterator design pattern:");
		IterableCollection collection=new IteratorDesignPattern();
		Iterator iter=collection.createIterator();
		int i=0;
		while(iter.hasMore())
		{
			String result=iter.getNext();
			LOGGER.info(++i+">"+result);
		}
    }
}
