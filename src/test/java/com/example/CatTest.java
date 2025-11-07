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
        when(mockFeline.eatMeat()).thenReturn(List.of("Мыши", "Птицы"));
        Cat cat = new Cat(mockFeline);

        List <String> actualFood = cat.getFood();

        assertEquals(List.of("Мыши", "Птицы"), actualFood);
        verify(mockFeline, times(1)).eatMeat();
    }

}