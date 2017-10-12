package example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


class Temp {


    @Test
    void someTest() {
    }


    @Test
    @DisplayName("my name")
    void t2() {
    }


    @Test
    @Tag("fast")
    void taggedTest() {
    }


    @FastTest
    void metaAnnotatedTest() {
    }





}

