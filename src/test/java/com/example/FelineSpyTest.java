package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FelineSpyTest {

    @Test
    void eatMeatReturnsPredatorsFood () throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);
        Mockito.when(felineSpy.getFood("Хищник")).thenReturn(List.of("Котлеты", "Отбивные"));

        List<String> actual = felineSpy.eatMeat();

        assertEquals(List.of("Котлеты", "Отбивные"), actual);
    }
}
