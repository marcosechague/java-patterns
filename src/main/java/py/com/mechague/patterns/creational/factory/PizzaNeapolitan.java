package py.com.mechague.patterns.creational.factory;

import java.util.Arrays;
import java.util.List;

public class PizzaNeapolitan implements Pizza{

	@Override
	public List<String> ingredients() {
		List<String> ingredients = Arrays.asList("Chesse mozzarella","Tomatoes", "Oregano");
		return ingredients;
	}
	
	@Override
	public String preparation() {
		String preparation = "NEAPOLITAN PIZZA - Put the Cheese, then tomatoes in parts, finally the oregano";
		return preparation;
	}

}
