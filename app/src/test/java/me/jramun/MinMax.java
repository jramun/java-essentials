package me.jramun;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class MinMax {

    @Test
    public void min() {
        final List<Integer> number = ImmutableList.of(1, 2, 3, 4, 5, 6, 7);
        Integer min = number.stream().min(Comparator.naturalOrder()).get();
        Assertions.assertEquals(min, 1);
    }


}
