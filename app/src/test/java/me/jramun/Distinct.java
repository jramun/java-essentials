package me.jramun;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {


    @Test
    public void distinct() {
        final List<Integer> number = ImmutableList.of(1, 2, 3, 4, 5, 6, 7, 5, 6);
        List<Integer> array = number.stream().distinct().collect(Collectors.toList());
        Assertions.assertEquals(array.size(), 7);
    }
}
