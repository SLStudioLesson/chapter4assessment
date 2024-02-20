package model;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Tag("Q1")
    @Test
    void testPersonConstructorAndGetters() {
        // テスト用のデータを準備
        String name = "John Doe";
        int age = 30;
        String country = "Country";
        String city = "City";
        String food = "Food";
        List<String> items = Arrays.asList("Item1", "Item2");

        // Personオブジェクトを作成
        Person person = new Person(name, age, country, city, food, items);

        // コンストラクタとゲッターが期待通りに動作するか検証
        assertThat(person.getName()).isEqualTo(name);
        assertThat(person.getAge()).isEqualTo(age);
        assertThat(person.getCountry()).isEqualTo(country);
        assertThat(person.getCity()).isEqualTo(city);
        assertThat(person.getFood()).isEqualTo(food);
        assertThat(person.getItems()).containsExactlyElementsOf(items);
    }

    @Tag("Q1")
    @Test
    void testSetters() {
        // Personオブジェクトをデフォルト値で作成
        Person person = new Person("", 0, "", "", "", Arrays.asList());

        // 新しい値をセット
        String newName = "Jane Doe";
        int newAge = 25;
        String newCountry = "New Country";
        String newCity = "New City";
        String newFood = "New Food";
        List<String> newItems = Arrays.asList("NewItem1", "NewItem2");

        person.setName(newName);
        person.setAge(newAge);
        person.setCountry(newCountry);
        person.setCity(newCity);
        person.setFood(newFood);
        person.setItems(newItems);

        // セッターが期待通りに動作するか検証
        assertThat(person.getName()).isEqualTo(newName);
        assertThat(person.getAge()).isEqualTo(newAge);
        assertThat(person.getCountry()).isEqualTo(newCountry);
        assertThat(person.getCity()).isEqualTo(newCity);
        assertThat(person.getFood()).isEqualTo(newFood);
        assertThat(person.getItems()).containsExactlyElementsOf(newItems);
    }
}
