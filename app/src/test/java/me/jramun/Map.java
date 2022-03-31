package me.jramun;

import com.google.common.collect.ImmutableList;
import me.jramun.mock.Mock;
import me.jramun.model.Person;
import me.jramun.model.PersonDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Map {

    @Test
    public void ourFirstMapping() throws IOException {
        ImmutableList<Person> people = Mock.getPeople();
        people.stream().filter(person -> person.getId() < 3).map(person -> new PersonDto(person.getId(), person.getFirstName() + " " + person.getLastName())).toList().forEach(System.out::println);
        Assertions.assertEquals(people.size(), 1000);
    }
}
