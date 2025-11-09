package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
import java.util.List;
import org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Test
    void getSoundReturnsMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        assertEquals("Мяу", cat.getSound());
    }


    @Test
    void getFoodCallsPredatorsEatMeat() throws Exception {
        Feline mockFeline = mock(Feline.class);
        List<String> expectedFood = List.of("Мыши", "Птицы");
        when(mockFeline.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(mockFeline);
        List <String> actualFood = cat.getFood();

        assertEquals(expectedFood, actualFood);
        verify(mockFeline, times(1)).eatMeat();
    }

}