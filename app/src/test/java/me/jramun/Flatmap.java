package me.jramun;

import me.jramun.mock.Mock;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.stream.Stream;

public class Flatmap {


    @Test
    public void flatMap() throws IOException {
        System.out.println(Mock.getPeople().stream().limit(20).flatMap(person -> Stream.of(person.getFirstName(), person.getLastName(), person.getId())).toList());
    }
}
