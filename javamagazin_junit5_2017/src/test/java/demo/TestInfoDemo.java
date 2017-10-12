package demo;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


class TestInfoDemo {

    @Test
    @DisplayName("my name")
    void aTest(TestInfo info) {
        System.out.println(info);
    }


}
