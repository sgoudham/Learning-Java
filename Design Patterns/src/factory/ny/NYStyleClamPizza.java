package factory.ny;

import factory.Pizza;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		setName("NY Style Clam Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");

		getToppings().add("Grated Reggiano Cheese");
		getToppings().add("Fresh Clams from Long Island Sound");
	}
}
