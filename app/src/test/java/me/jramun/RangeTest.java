package me.jramun;

import me.jramun.mock.Mock;
import me.jramun.model.Person;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

public class RangeTest {

    @Test
    public void range() {
        System.out.println("for i");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("exclusive");
        IntStream.range(0, 10).forEach(System.out::println);
        System.out.println("inclusive");
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
    }

    @Test
    public void rangeIteratingLists() throws IOException {
        List<Person> people = Mock.getPeople();
        IntStream.range(0, people.size()).forEach(index -> {
            Person person = people.get(index);
            System.out.println(person);
        });
    }


    @Test
    public void intStreamIterate() {
        IntStream.iterate(0, operand -> operand + 1).filter(value -> value % 2 == 0).limit(20).forEach(System.out::println);
    }
}
