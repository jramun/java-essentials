package me.jramun;

import me.jramun.mock.Mock;
import me.jramun.model.Person;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.stream.Collectors;

public class Joining {

    @Test
    public void joining() throws IOException {
        System.out.println(Mock.getPeople().stream().map(Person::getFirstName).collect(Collectors.joining(",")));
    }
}
