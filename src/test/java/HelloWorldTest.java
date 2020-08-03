import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_Hello_World() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi();
        assertEquals("Hello World", result);
    }

    @Test
    public void sayHi_with_satapitchakorn_should_return_Hello_Satapitchakorn() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi("satapitchakorn");
        assertEquals("Hello Satapitchakorn", result);
    }
    @Test
    public void sayHi_with_mac_should_return_Hello_Mac() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi("mac");
        assertEquals("Hello Mac", result);
    }
}