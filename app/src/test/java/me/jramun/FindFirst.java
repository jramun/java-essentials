package me.jramun;

import me.jramun.mock.Mock;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FindFirst {

    @Test
    public void findFirst() throws IOException {
        System.out.println(Mock.getPeople().stream().findFirst());
    }
}
