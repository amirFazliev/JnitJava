import org.example.Contact;
import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//todo Домашнее задание к занятию 4.5. Коллекции TreeMap и TreeSet  - Пропущенные звонки

public class MainTests {
    PhoneBook phoneBookTest = new PhoneBook();
    Contact first = new Contact("first", "89");
    Contact second =  new Contact("second", "89");
    Contact third =  new Contact("third", "800");
    Contact fourth = new Contact(null, "95");

    @Test
    public void testContactEqualsTrueInContact() {
        Boolean expected = true;

        boolean result = first.equals(second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testContactEqualsFalseInContact() {
        Boolean expected = false;

        boolean result = first.equals(third);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSeachContactNumberInPhonebookNull () {
        phoneBookTest.addPhoneBook(first.getNumberPhone(), first);

        Contact result = phoneBookTest.seachContactNumber("88");

        Assertions.assertNull(result);
    }

    @Test
    public void testSeachContactNumberInPhonebookNotNull () {
        phoneBookTest.addPhoneBook(first.getNumberPhone(), first);

        Contact result = phoneBookTest.seachContactNumber("89");

        Assertions.assertNotNull(result);
    }

    @Test
    public void testInNullInPhonebookNull () {
        String expected = fourth.getNumberPhone();

        String result = phoneBookTest.testInNull(fourth);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInNullInPhonebookNotNull () {
        String expected = first.getName();

        String result = phoneBookTest.testInNull(first);

        Assertions.assertEquals(expected, result);
    }
}
