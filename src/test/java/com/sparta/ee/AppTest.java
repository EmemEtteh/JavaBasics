package com.sparta.ee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("check that 5 == 5")
    void simpleTest() {
        Assertions.assertEquals(true, 5 == 5);
    }

    // @Test
    // @DisplayName("check that we can return Good Morning")

    @Test
    @DisplayName("check that we can return Good Morning")
    void checkWeCanReturnGoodMorning() {
        Assertions.assertEquals("Good Morning!", App.greeting(0));
    }

    @Test
    @DisplayName("check that we can return Good Afternoon")
    void checkWeCanReturnGoodAfternoon() {
        Assertions.assertEquals("Good Afternoon", App.greeting(13));
    }

    @Test
    @DisplayName("check that we can return Good Evening")
    void checkWeCanReturnGoodEvening() {
        Assertions.assertEquals("Good Evening", App.greeting(21));
    }

    @Test
    @DisplayName("check that if value is 24/anything else, return last message")
    void checkYouAreInAnotherDimension(){
        Assertions.assertEquals("You're in another dimension", App.greeting(24));
    }
}
