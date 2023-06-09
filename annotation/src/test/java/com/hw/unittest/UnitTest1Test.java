package com.hw.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = UnitTest1.class)
class UnitTest1Test {

    @Autowired
    private UnitTest1 unitTest1;

    @BeforeEach
    void setUp() {
        System.out.println("execute before...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("execute after...");
    }

    @Test
    void equalZero() {

        Assertions.assertTrue(unitTest1.equalZero(0));
    }

    @Test
    void lessZero() {
    }
}