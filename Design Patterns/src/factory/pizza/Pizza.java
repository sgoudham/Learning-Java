package factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	private String name;
	private String dough;
	private String sauce;
	private final List<String> toppings = new ArrayList<>();
 
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
  
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
  
	public void box() { System.out.println("Place pizza in official PizzaStore box"); }

	public String getName() { return name; }

	public void setName(String name) {
		this.name = name;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public List<String> getToppings() {
		return toppings;
	}

	@Override
	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append("---- ").append(name).append(" ----\n");
		display.append(dough).append("\n");
		display.append(sauce).append("\n");
		for (String topping : toppings) {
			display.append(topping).append("\n");
		}
		return display.toString();
	}
}

 
 
