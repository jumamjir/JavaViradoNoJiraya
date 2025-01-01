package academy.devdojo.maratonajava.javacore.ZZKjunit.dominio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class DeveloperTest {

    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChildType() {
        Employee employeeDeveloper = new Developer("1", "Java");
        if(employeeDeveloper instanceof Developer) {
            Developer developer = (Developer) employeeDeveloper;
            assertEquals("Java", developer.getMainLanguage());
        }

        if(employeeDeveloper instanceof Developer developer) {
            assertEquals("Java", developer.getMainLanguage());
        }
    }

}