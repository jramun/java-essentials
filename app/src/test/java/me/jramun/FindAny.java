package me.jramun;

import me.jramun.mock.Mock;
import me.jramun.model.Person;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FindAny {


    @Test
    public void findAny() throws IOException {
        Person p = Mock.getPeople().stream().filter(person -> person.getId() > 998).findAny().get();
        System.out.println(p);
    }
}
