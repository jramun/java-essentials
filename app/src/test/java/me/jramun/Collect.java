package me.jramun;

import me.jramun.mock.Mock;
import me.jramun.model.Person;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

public class Collect {

    @Test
    public void understandingCollect() throws IOException {
        ArrayList<String> collect = Mock.getPeople().stream().map(Person::getFirstName).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        collect.forEach(System.out::println);
    }
}
