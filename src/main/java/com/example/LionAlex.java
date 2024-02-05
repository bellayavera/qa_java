package com.example;

import java.util.List;

public class LionAlex extends Lion {

    private final Predator predator;
    private final String sex;

    public LionAlex(Predator predator, String sex) throws Exception {
        super(predator, sex);
        this.sex = "Самец";
        this.predator = predator;
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
