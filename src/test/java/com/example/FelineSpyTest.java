package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class FelineSpyTest {


    @Test
    void eatMeatReturnsPredatorsFood () throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);

        List <String> expected = List.of("Котлеты", "Отбивные");
        Mockito.when(felineSpy.getFood("Хищник")).thenReturn(expected);
        List<String> actual = felineSpy.eatMeat();

        assertEquals(expected, actual);
        Mockito.verify(felineSpy).getFood("Хищник");
    }
}
