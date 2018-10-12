package py.com.mechague.patterns.creational.factory;

import java.util.Optional;

public class FactoryPizza {
	//We return an optional, then the caller know that it can be a null
	public static Optional<Pizza> getPizza(PizzaType type) {
		if(type==null) { 
			return Optional.empty();
		}
		Pizza pizza = null;
		switch (type) {
		case PEPERONI:
			pizza = new PizzaPeperoni();
			break;
		case NEAPOLITAN:
			pizza = new PizzaNeapolitan();
			break;
		default:
			break;
		}
		return Optional.ofNullable(pizza);
	}
}
