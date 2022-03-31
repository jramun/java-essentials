package me.jramun;

import me.jramun.mock.Mock;
import me.jramun.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Average {

    @Test
    public void averagePersonId() throws IOException {
        double value = Mock.getPeople().stream().mapToDouble(Person::getId).average().orElse(0);
        System.out.println(value);
        Assertions.assertEquals(value, 500.5);
    }
}
