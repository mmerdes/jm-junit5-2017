package demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedTestDemo {


    @ParameterizedTest
    @MethodSource("providerMethod")
    void testWithParametersFromMethods(String parameter) {
        assertEquals("two", parameter);
    }

    static Iterable<String> providerMethod() {
        return asList("one", "two", "three");
    }


}