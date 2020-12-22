package factory.ny;

import factory.Pizza;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		setName("NY Style Pepperoni Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");

		getToppings().add("Grated Reggiano Cheese");
		getToppings().add("Sliced Pepperoni");
		getToppings().add("Garlic");
		getToppings().add("Onion");
		getToppings().add("Mushrooms");
		getToppings().add("Red Pepper");
	}
}
