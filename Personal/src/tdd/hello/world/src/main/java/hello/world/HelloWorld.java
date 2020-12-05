package tdd.hello.world.src.main.java.hello.world;

/**
 * Hello world!
 *
 */
public class HelloWorld {
    public static void main(String[] args) {
        Greeting greeting = new Greeting("Hello World");
        System.out.println(greeting.getMessage());
    }
}
