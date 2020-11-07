package test.java.hello.world;

import main.java.hello.world.Greeting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void greetingMessageShouldPass() {
        Greeting greeting = new Greeting("Hello World");
        assertEquals("Hello World", greeting.getMessage());
    }

    @Test
    public void greetingMessageShouldFail() {
        Greeting greeting = new Greeting("Not Hello World");
        assertEquals("Hello World", greeting.getMessage());
    }
}
