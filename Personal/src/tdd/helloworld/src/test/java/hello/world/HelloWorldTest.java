package tdd.helloworld.src.test.java.hello.world;

import org.junit.Test;
import tdd.helloworld.src.main.java.hello.world.Greeting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
        assertNotEquals("Hello World", greeting.getMessage());
    }
}
