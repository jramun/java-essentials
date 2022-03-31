package me.jramun;

import me.jramun.mock.Mock;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class LazyValuation {


    @Test
    public void understandingLazyValuation() throws IOException {
        System.out.println(Mock.getPeople().stream().filter(person -> {
            System.out.println("Filter " + person);
            return person.getGender().equals("Male");
        }).map(person -> {
            System.out.println("Map first " + person);
            return person.getId() + 10;
        }).map(integer -> {
            System.out.println("Map second " + integer);
            return integer * 1.4;
        }));

        System.out.println("---------------------------------");

        System.out.println(Mock.getPeople().stream().filter(person -> {
            System.out.println("Filter " + person);
            return person.getGender().equals("Male");
        }).map(person -> {
            System.out.println("Map first " + person);
            return person.getId() + 10;
        }).map(integer -> {
            System.out.println("Map second " + integer);
            return integer * 1.4;
        }).toList());
    }
}
