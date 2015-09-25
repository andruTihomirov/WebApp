package com.andru;

import org.junit.*;

/**
 * Created by andrey.tihomirov on 25.09.2015.
 */
public class MainTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @Before
    public void before0() {
        System.out.println("before0");
    }

    @Test
    public void method0() {
        System.out.println("method0");
    }

    @After
    public void after0() {
        System.out.println("after0");
    }

    @Before
    public void before1() {
        System.out.println("before1");
    }

    @Test
    public void method1() {
        System.out.println("method1");
    }

    @After
    public void after1() {
        System.out.println("after1");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }


}
