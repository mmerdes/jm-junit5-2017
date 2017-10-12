package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HalloJUnit5 {

    @BeforeAll
    static void setupServer() { }

    @BeforeEach
    void prepareDatabase() { }

    @Test
    void myTest() { }

    @AfterEach
    void cleanupDatabase() { }

    @AfterAll
    static void tearDownServer() { }



}
