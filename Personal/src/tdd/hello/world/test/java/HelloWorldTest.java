package tdd.hello.world.test.java;

import org.junit.Test;
import tdd.hello.world.src.java.Greeting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class HelloWorldTest {

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