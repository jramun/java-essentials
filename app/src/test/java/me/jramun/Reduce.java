package me.jramun;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Reduce {

    @Test
    public void reduce() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        Integer reduce = Arrays.stream(array).reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
