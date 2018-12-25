package com.example.testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExTest {
    private Ex ex;

    @Before
    public void init() {
        ex = new Ex();
    }

    @Test
    public void methodTest1() {
        int number = 3;
        Assert.assertEquals(number, ex.method(number));
    }

    @Test
    public void methodTest2() {
        int number = 5;
        Assert.assertEquals(number, ex.method(number));
    }
}
