import org.example.Contact;
import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBookTest = new PhoneBook();
    Contact first = new Contact("first", "89");
    Contact second = new Contact(null, "95");

    @Test
    public void testSeachContactNumberInPhonebookNull () {
        phoneBookTest.addPhoneBook(first.getNumberPhone(), first);
        Contact expected = null;

        Contact result = phoneBookTest.seachContactNumber("88");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSeachContactNumberInPhonebookNotNull () {
        phoneBookTest.addPhoneBook(first.getNumberPhone(), first);
        Contact expected = first;

        Contact result = phoneBookTest.seachContactNumber("89");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInNullInPhonebookNull () {
        String expected = second.getNumberPhone();

        String result = phoneBookTest.testInNull(second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInNullInPhonebookNotNull () {
        String expected = first.getName();

        String result = phoneBookTest.testInNull(first);

        Assertions.assertEquals(expected, result);
    }
}
