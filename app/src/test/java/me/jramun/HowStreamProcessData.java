package me.jramun;

import me.jramun.mock.Mock;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.stream.Stream;

public class HowStreamProcessData {

    @Test
    public void understandingHowStreamProcessData() throws IOException {
        //without flatmap
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
        //with flatmap
        System.out.println(Mock.getPeople().stream().filter(person -> {
            System.out.println("Filter " + person);
            return person.getGender().equals("Male");
        }).flatMap(person -> {
            System.out.println("FlatMap first " + person);
            return Stream.of(person.getFirstName(), person.getLastName());
        }).map(s -> {
            System.out.println("Map second " + s);
            return "#" + s + "#";
        }).toList());
    }
}
