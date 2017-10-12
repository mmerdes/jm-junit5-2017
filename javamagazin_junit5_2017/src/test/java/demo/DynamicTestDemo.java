package demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


class DynamicTestDemo {

    @TestFactory
    @DisplayName("A dynamic test collection")
    Collection<DynamicTest> dynamicTestCollection() {
        return Arrays.asList(
                dynamicTest("test1", () -> assertTrue(true)),
                dynamicTest("test2", () -> {})
        );
    }

}
