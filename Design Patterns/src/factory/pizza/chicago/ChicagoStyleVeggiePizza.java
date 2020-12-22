package factory.pizza.chicago;

import factory.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza() {
		setName("Chicago Deep Dish Veggie Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");

		getToppings().add("Shredded Mozzarella Cheese");
		getToppings().add("Black Olives");
		getToppings().add("Spinach");
		getToppings().add("Eggplant");
	}
 
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
