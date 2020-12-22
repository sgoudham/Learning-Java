package factory.coffee;

public class MoonBucks {

    public Coffee orderCoffee(String type){

        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee coffee = coffeeFactory.createCoffee(type);
        System.out.println("-------Brewing a " + coffee.getName() + "-------");
        coffee.grindBeans();
        coffee.steamMilk();
        coffee.getCup();
        coffee.pourShot();
        coffee.serveCoffee();

        return coffee;

    }

}
