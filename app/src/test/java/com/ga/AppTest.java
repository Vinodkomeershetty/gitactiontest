/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ga;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();
        System.out.println("========");
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
