package trying.with.resources;

import java.io.IOException;

/**
 * Created by Jim on 1/9/2016.
 */
public class MyAutoCloseable implements AutoCloseable {
    public void saySomething() throws IOException{
        throw new IOException("Exception Thrown 1");
//        System.out.println("Something");
    }
    @Override
    public void close() throws IOException {
        throw new IOException("Exception Thrown 2");
//        System.out.println("close");
    }
}
