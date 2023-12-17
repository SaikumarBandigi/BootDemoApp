package com.demo;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class BootDemoAppApplicationTests {
    private Calculator c = new Calculator();

    @Test
    void contextLoads() {

    }


    @Test
    void testDoSum() {
        int exp = 6;
        int act = c.doSum(1, 2, 3);
        assertThat(exp).isEqualTo(act);
    }

    @Test
    void testDoProduct() {
        int exp = 2;
        int act = c.doProduct(1, 2);
        assertThat(exp).isEqualTo(act);
    }

    @Test
    @Disabled
    void testcompareTwoNums() {
        boolean act = c.compareTwoNums(2, 2);
        assertThat(act).isTrue();
    }

//    @Test
//    public void testSomething() {
//        int result = someMethod();
//        assertEquals(42, result, "Expected the result to be 42");
//    }
//
//    private int someMethod() {
//        // This method should return 42
//        return c.doProduct(6, 7);
//    }


}

