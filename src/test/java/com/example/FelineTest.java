package com.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FelineTest {
    private Feline feline;

    @BeforeEach
        void setup () {
             feline = new Feline();
        }
        @Test
        void getFamilyShouldReturnFeline () {
            String felineFamily = feline.getFamily();

            assertEquals("Кошачьи", felineFamily);
    }

    @Test
        void getKittensWithParamReturnsParamAmount() {
            int kittens = feline.getKittens(2);

            assertEquals(2, kittens);
        }

    @Test
        void getKittensWithoutParamReturns1() {

        assertEquals(1, feline.getKittens());
    }
}
