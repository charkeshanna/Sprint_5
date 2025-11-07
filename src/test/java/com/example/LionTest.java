package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

@ExtendWith(MockitoExtension.class)


class LionTest {

    @Mock
    Feline feline;
    @Test
    void getKittensFelineAmount3Returns3() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самка", feline);

        int actual = lion.getKittens();

        assertEquals(3, actual);
        Mockito.verify(feline).getKittens();
    }

    @Test
    void LionConstructorWithInvalidSexThrowsException() {
        String invalidSex = "unknown";

        Exception exception = assertThrows(Exception.class, () -> new Lion(invalidSex, feline));

        assertEquals("Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage());
    }


    @Test
    void getFoodForPredatorReturnsPredatorsList() throws Exception {
        List <String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", feline);

        List <String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
        Mockito.verify(feline).getFood("Хищник");
    }

}

