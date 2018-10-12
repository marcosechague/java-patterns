package py.com.mechague.patterns.creational.factory;

public class FactoryPizzaDemo {

	/**
	 * Demo class for our PizzaFactory
	 */
	public static void main(String[] args) {
		//We received an optional, so it can be null;
		Pizza pizza = FactoryPizza.getPizza(PizzaType.NEAPOLITAN)
								   .orElseThrow(IllegalArgumentException::new);
		System.out.println(pizza.preparation());
		
		pizza = FactoryPizza.getPizza(PizzaType.PEPERONI)
				   .orElseThrow(IllegalArgumentException::new);
		System.out.println(pizza.preparation());
		
		pizza = FactoryPizza.getPizza(null)
				   .orElseThrow(IllegalArgumentException::new);
	}
	
}
