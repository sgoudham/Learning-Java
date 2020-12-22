package factory.chicago;

import factory.Pizza;
import factory.PizzaStore;

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
