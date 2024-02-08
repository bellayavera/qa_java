package com.example;

import java.util.List;

public class LionAlex extends Lion {

    private final Predator predator;
    private final String sex;

    public LionAlex(Feline feline, String sex) throws Exception {
        super(feline, sex);
        this.sex = "Самец";
        this.predator = feline;
    }

    public List<String> getFriends(){
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens(){
        return predator.getKittens(0);
    }

}
