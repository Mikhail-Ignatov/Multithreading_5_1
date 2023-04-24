import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;


public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    void startTest() {
        System.out.println("Начало теста");
        phoneBook = new PhoneBook();
    }

    @AfterEach
    void endTest() {
        System.out.println("Окончание теста");
        phoneBook = null;
    }

    @Test
    void addTest() {
        String name = "Петя";
        String number = "+7(999) 111-22-33";
        int expected = 1;
        Assertions.assertEquals(expected, phoneBook.add(name, number));
    }
}
