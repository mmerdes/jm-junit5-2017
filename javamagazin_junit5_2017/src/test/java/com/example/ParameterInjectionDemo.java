package com.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;


class ParameterInjectionDemo {

    @Test
    @DisplayName("my name")
    void aTest(TestInfo info) {
        System.out.println(info);
    }

    @Test
    void reporting(TestReporter reporter) {
        reporter.publishEntry("balance", "47.11");
    }


}
