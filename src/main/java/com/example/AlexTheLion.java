package com.example;
import java.util.List;
import java.util.Arrays;

public class AlexTheLion extends Lion {

    public AlexTheLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    List<String> getFriends () {
        return Arrays.asList("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
