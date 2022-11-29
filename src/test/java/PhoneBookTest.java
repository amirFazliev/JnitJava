import org.example.Contact;
import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    public Contact first = new Contact("first", "89");
    public Contact second = new Contact(null, "95");

    @Test
    public void testSeachContactNumberInPhonebookNull () {
        PhoneBook phoneBookTest = new PhoneBook();
        phoneBookTest.addPhoneBook(first.getNumberPhone(), first);
        Contact expected = null;

        Contact result = phoneBookTest.seachContactNumber("88");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSeachContactNumberInPhonebookNotNull () {
        PhoneBook phoneBookTest = new PhoneBook();
        phoneBookTest.addPhoneBook(first.getNumberPhone(), first);
        Contact expected = first;

        Contact result = phoneBookTest.seachContactNumber("89");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInNullInPhonebookNull () {
        PhoneBook phoneBookTest = new PhoneBook();
        String expected = second.getNumberPhone();

        String result = phoneBookTest.testInNull(second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInNullInPhonebookNotNull () {
        PhoneBook phoneBookTest = new PhoneBook();
        String expected = first.getName();

        String result = phoneBookTest.testInNull(first);

        Assertions.assertEquals(expected, result);
    }
}
