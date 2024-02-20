package question3;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import model.Person;
import question2.Q2Execute;

@Tag("Q3")
public class Q3ExecuteTest {
        private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private String testFilePath = "src/test/resources/testPeopleData.csv";
    private String testExportData = "src/test/resources/testExportData.csv";

    @TempDir
    Path tempDir;

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
    public void testGetKyotoFavoriteFoods() {
        List<Person> peopleList = Arrays.asList(
            new Person("Person1", 20, "Japan", "Kyoto", "Sushi", Arrays.asList("Item1")),
            new Person("Person2", 25, "Japan", "Osaka", "Takoyaki", Arrays.asList("Item2")),
            new Person("Person3", 30, "Japan", "Kyoto", "Yuba", Arrays.asList("Item3")),
            new Person("Person4", 35, "Japan", "Kyoto", "Matcha", Arrays.asList("Item4")),
            new Person("Person5", 40, "Japan", "Tokyo", "Ramen", Arrays.asList("Item5"))
        );

        Set<String> kyotoFoods = Q3Execute.getKyotoFavoriteFoods(peopleList);

        assertThat(kyotoFoods).containsExactlyInAnyOrder("Sushi", "Yuba", "Matcha");
    }

        @Test
    public void testGetCityFoodMap() {
        List<Person> peopleList = Arrays.asList(
            new Person("Person1", 20, "Japan", "Kyoto", "Sushi", Arrays.asList("Item1")),
            new Person("Person2", 25, "Japan", "Osaka", "Takoyaki", Arrays.asList("Item2")),
            new Person("Person3", 30, "Japan", "Kyoto", "Yuba", Arrays.asList("Item3")),
            new Person("Person4", 35, "Japan", "Tokyo", "Ramen", Arrays.asList("Item4")),
            new Person("Person5", 40, "Japan", "Osaka", "Okonomiyaki", Arrays.asList("Item5")),
            new Person("Person6", 22, "Japan", "Kyoto", "Matcha", Arrays.asList("Item6"))
        );

        Map<String, Set<String>> cityFoodMap = Q3Execute.getCityFoodMap(peopleList);

        assertThat(cityFoodMap)
            .hasSize(3)
            .containsKeys("Kyoto", "Osaka", "Tokyo")
            .containsEntry("Kyoto", Set.of("Sushi", "Yuba", "Matcha"))
            .containsEntry("Osaka", Set.of("Takoyaki", "Okonomiyaki"))
            .containsEntry("Tokyo", Set.of("Ramen"));
    }

        @Test
    public void testWriteMapToCSV() throws Exception {
        List<Person> peopleList = Q3Execute.loadPeopleData(testFilePath);

        List<String> expected = Files.readAllLines(Paths.get(testExportData));
        Path csvFile = tempDir.resolve("testOutput.csv");
        Map<String, Map<String, Set<String>>> countryCityFoodMap = Q3Execute.getCountryCityFoodMap(peopleList);
        Q3Execute.writeMapToCSV(csvFile.toString(), countryCityFoodMap);

        List<String> lines = Files.readAllLines(csvFile);
        assertThat(lines).containsAll(expected);
    }
}
