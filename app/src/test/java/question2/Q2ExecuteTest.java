package question2;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import model.Person;

@Tag("Q2")
public class Q2ExecuteTest {
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private String testFilePath = "src/test/resources/testPeopleData.csv";

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testLoadPeopleDataWithArgument() {

        List<Person> peopleList = Q2Execute.loadPeopleData(testFilePath);
        
        assertThat(peopleList).isNotNull();
        assertThat(peopleList).hasSize(100);

        Person firstPerson = peopleList.get(0);
        assertThat(firstPerson.getName()).isEqualTo("Sarah");
        assertThat(firstPerson.getAge()).isEqualTo(21);
        assertThat(firstPerson.getCountry()).isEqualTo("France");
        assertThat(firstPerson.getCity()).isEqualTo("Paris");
        assertThat(firstPerson.getFood()).isEqualTo("Macaron");
        assertThat(firstPerson.getItems()).containsExactly("Cigarette", "Phone", "Book");
    }

    @Test
    public void testRemoveAndOutputNames() {
        List<Person> peopleList = Q2Execute.loadPeopleData(testFilePath);

        Q2Execute.removeAndOutputNames(peopleList);

        String[] outputNames = outContent.toString().trim().split("\\R");

        String[] expectedNames = {
            "Sarah", "Emily", "Francesco", "Liam", "Hannah", "Noah", "Louis", "Olivia", "Emma", 
            "Luca", "Emma", "Anna", "Kenji", "Francesco", "Alessandro", "Louis", "Liam", "Jessica", 
            "Liam", "Avery", "Alessandro", "Ashley", "Alice", "Alice", "Chiara", "Finn", "Sarah", 
            "Emma", "Michael", "Aurora", "Charlotte", "Alessandro", "Sophia"
        };

        assertThat(outputNames).containsExactly(expectedNames);
    }

    @Test
    public void testPrintFormattedPeopleList() {
        List<Person> peopleList = Q2Execute.loadPeopleData(testFilePath);

        Q2Execute.printFormattedPeopleList(peopleList);

        String[] outputLines = outContent.toString().trim().split("\\R");

        String[] expectedLines = {
            "Sarah was born in France",
            "Emily was born in America",
            "Francesco was born in Italy",
            "Liam was born in Canada",
            "Hannah was born in Germany",
            "Noah was born in Canada",
            "Louis was born in France",
            "Olivia was born in Canada",
            "Emma was born in Germany",
            "Emily was born in America",
            "Rin was born in Japan",
            "Kenji was born in Japan",
            "Emily was born in America",
            "Giulia was born in Italy",
            "Sakura was born in Japan",
            "Emily was born in America",
            "Max was born in Germany",
            "Kenji was born in Japan",
            "Sarah was born in America",
            "Ashley was born in America",
            "Louis was born in France",
            "Mia was born in Germany",
            "Leon was born in Germany",
            "James was born in America",
            "Noah was born in Canada"
        };

        assertThat(outputLines).containsExactly(expectedLines);
    }

    @Test
    public void testPrintNamesWithBook() {
        List<Person> peopleList = Q2Execute.loadPeopleData(testFilePath);

        Q2Execute.printNamesWithBook(peopleList);

        String[] outputLines = outContent.toString().trim().split("\\R");

        String[] expectedLines = {
            "Sarah",
            "Hannah",
            "Emma",
            "Kenji",
            "Giulia",
            "Ashley",
            "Leon",
            "Leo",
            "Benjamin",
            "Camille",
            "Sofia",
            "Chloe",
            "Charlotte",
            "Yuki",
            "Lukas",
            "Paul",
            "Luca",
            "Anna",
            "Francesco",
            "Robert",
            "Hiroshi",
            "Olivia",
            "Liam",
            "Alessandro",
            "Finn",
            "Sophia"
        };

        assertThat(outputLines).containsExactlyInAnyOrder(expectedLines);
    }

    @Test
    public void testPrintNumberWithCigarette() {
        List<Person> peopleList = Q2Execute.loadPeopleData(testFilePath);

        Q2Execute.printNumberWithCigarette(peopleList);

        String output = outContent.toString().trim();

        int expectedCount = 51;

        assertThat(output).isEqualTo("There are " + expectedCount + " smokers.");
    }

}
