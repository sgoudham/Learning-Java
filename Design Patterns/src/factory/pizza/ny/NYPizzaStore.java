package factory.pizza.ny;

import factory.pizza.Pizza;
import factory.pizza.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		return switch (item) {
			case "cheese" -> new NYStyleCheesePizza();
			case "veggie" -> new NYStyleVeggiePizza();
			case "clam" -> new NYStyleClamPizza();
			case "pepperoni" -> new NYStylePepperoniPizza();
			default -> null;
		};
	}
}
