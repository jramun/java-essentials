package me.jramun;

import me.jramun.mock.Mock;
import me.jramun.model.Person;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Group {

    @Test
    public void simpleGrouping() throws IOException {
        Mock.getPeople().stream().filter(person -> person.getId() > 800).collect(Collectors.groupingBy(Person::getGender)).forEach((s, list) -> {
            System.out.println(s + " " + list);
        });
    }


    @Test
    public void groupingAndCounting() throws IOException {
        Map<Person, Long> collect = Mock.getPeople().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((person, aLong) -> System.out.println(person + " " + aLong));
    }
}
