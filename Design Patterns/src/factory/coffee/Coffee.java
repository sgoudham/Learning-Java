package factory.coffee;

public abstract class Coffee {

    private String name;
    private String milk;
    private String beans;

    public void grindBeans(){ System.out.println("Grinding beans....");}

    public void steamMilk(){ System.out.println("Steaming milk...."); }

    public void serveCoffee(){
        System.out.println("Serving coffee....");
    }

    public void pourShot(){
        System.out.println("Shot of coffee....");
    }

    public void getCup(){
        System.out.println("Cup selected....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getBeans() {
        return beans;
    }

    public void setBeans(String beans) { this.beans = beans; }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", milk='" + milk + '\'' +
                ", beans='" + beans + '\'' +
                '}';
    }
}
