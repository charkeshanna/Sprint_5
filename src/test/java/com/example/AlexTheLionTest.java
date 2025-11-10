package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlexTheLionTest {
    private AlexTheLion alex;
    @BeforeEach
            void setup() throws Exception {
        Feline feline = new Feline();
        alex = new AlexTheLion(feline);
    }

    @Test
    void getPlaceOfLivingReturnsValidValue ()  {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    void getFriendsReturnsCorrectValues () {
        List<String>  actualResult = alex.getFriends();
        List<String> expectedResult = Arrays.asList("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getKittensReturnValidValue() {
        assertEquals(0, alex.getKittens());
    }
}
