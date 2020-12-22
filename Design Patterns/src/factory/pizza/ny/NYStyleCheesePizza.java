package factory.pizza.ny;

import factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		setName("NY Style Sauce and Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");

		getToppings().add("Grated Reggiano Cheese");
	}
}
