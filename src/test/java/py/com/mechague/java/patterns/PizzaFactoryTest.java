package py.com.mechague.java.patterns;

import java.util.Optional;

import org.junit.Test;

import junit.framework.Assert;
import py.com.mechague.patterns.creational.factory.FactoryPizza;
import py.com.mechague.patterns.creational.factory.PizzaType;

public class PizzaFactoryTest {
	
	@Test
	public void testPeperoniPizza(){
		Assert.assertEquals("PEPERONI PIZZA - Put the Cheese, then peperoni and onion, finally the oregano", FactoryPizza.getPizza(PizzaType.PEPERONI).get().preparation());
	}
	
	@Test
	public void testNeapolitanPizza(){
		Assert.assertEquals("NEAPOLITAN PIZZA - Put the Cheese, then tomatoes in parts, finally the oregano", FactoryPizza.getPizza(PizzaType.NEAPOLITAN).get().preparation());
	}
	
	@Test
	public void testUknownPizza(){
		Assert.assertEquals(Optional.empty(), FactoryPizza.getPizza(null));
	}

}
