package me.jramun;

import com.google.common.collect.ImmutableList;
import me.jramun.mock.Mock;
import me.jramun.model.Person;
import me.jramun.model.PersonDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Filter {

    @Test
    public void understandingFilter() throws IOException {
        ImmutableList<Person> people = Mock.getPeople();
        List<Person> collect = people.stream().filter(person -> person.getId() > 997).toList();
        collect.forEach(System.out::println);
    }

}
