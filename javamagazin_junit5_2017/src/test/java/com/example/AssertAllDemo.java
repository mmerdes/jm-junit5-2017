package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AssertAllDemo {

    @Test
    void assertionGroup() {

        assertAll("Three asserts as a group",
                () -> assertEquals(4, 17),
                () -> assertTrue(false, "Second test also fails"),
                () -> assertEquals(4, 4)
        );

    }

}
