package factory.pizza.chicago;

import factory.pizza.Pizza;
import factory.pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		return switch (item) {
			case "cheese" -> new ChicagoStyleCheesePizza();
			case "veggie" -> new ChicagoStyleVeggiePizza();
			case "clam" -> new ChicagoStyleClamPizza();
			case "pepperoni" -> new ChicagoStylePepperoniPizza();
			default -> null;
		};
	}
}
