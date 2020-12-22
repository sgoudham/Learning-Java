package factory.ny;

import factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		setName("NY Style Veggie Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");

		getToppings().add("Grated Reggiano Cheese");
		getToppings().add("Garlic");
		getToppings().add("Onion");
		getToppings().add("Mushrooms");
		getToppings().add("Red Pepper");
	}
}
