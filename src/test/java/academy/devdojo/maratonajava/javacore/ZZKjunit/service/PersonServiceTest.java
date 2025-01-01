package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PersonServiceTest {
    @Test
    public void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        assertFalse(personService.isAdult(person));
    }

    @Test
    public void isAdult_ReturnTrue_WhenAgeIsGreaterOrEquals18() {
        Person person = new Person(18);
        PersonService personService = new PersonService();
        assertTrue(personService.isAdult(person));
    }
}