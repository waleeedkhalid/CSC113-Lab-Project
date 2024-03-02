package com.csc113.project;

public class Parrot extends Pet{

    private boolean TalkingAbility;
    private String Species;

    public Parrot(String name, int age, String gender, boolean TalkingAbility, String Species) {
        super(name, age, gender);
        this.TalkingAbility = TalkingAbility;
        this.Species = Species;
    }

    public boolean isTalkingAbility() {
        return TalkingAbility;
    }

    public void setTalkingAbility(boolean talkingAbility) {
        TalkingAbility = talkingAbility;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

}
