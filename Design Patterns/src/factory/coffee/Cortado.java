package factory.coffee;

public class Cortado extends Coffee{

    public Cortado() {
        setName("Cortado");
        setBeans("Columbian");
        setMilk("Semi Skimmed Milk");
    }

    @Override
    public void grindBeans() {
        System.out.println("Grinding Beans Extra fine....");
    }

}


