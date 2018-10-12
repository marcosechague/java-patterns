package py.com.mechague.patterns.creational.factory;

import java.util.Arrays;
import java.util.List;

public class PizzaPeperoni implements Pizza{

	@Override
	public List<String> ingredients() {
		List<String> ingredients = Arrays.asList("Chesse","Peperoni", "Oregano", "Onion");
		return ingredients;
	}
	
	@Override
	public String preparation() {
		String preparation = "PEPERONI PIZZA - Put the Cheese, then peperoni and onion, finally the oregano";
		return preparation;
	}
}
