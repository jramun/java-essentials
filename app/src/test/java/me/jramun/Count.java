package me.jramun;

import me.jramun.mock.Mock;
import me.jramun.model.Person;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Count {

    @Test
    public void count() throws IOException {
        System.out.println(Mock.getPeople().stream().filter(person -> person.getId() > 999).count());
    }

    @Test
    public void max() throws IOException {
        System.out.println(Mock.getPeople().stream().mapToDouble(Person::getId).max());
    }

    @Test
    public void statistics() throws IOException {
        System.out.println(Mock.getPeople().stream().mapToDouble(Person::getId).summaryStatistics());
    }


}
