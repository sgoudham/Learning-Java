package factory.pizza.chicago;

import factory.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		setName("Chicago Style Pepperoni Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
 
		getToppings().add("Shredded Mozzarella Cheese");
		getToppings().add("Black Olives");
		getToppings().add("Spinach");
		getToppings().add("Eggplant");
		getToppings().add("Sliced Pepperoni");
	}
 
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
