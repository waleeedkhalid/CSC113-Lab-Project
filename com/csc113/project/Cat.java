package com.csc113.project;

public class Cat extends Pet {
    private String Color;
    private String Trait;

    public Cat(String name, int age, String gender, String color, String trait) {
        super(name, age, gender);
        Color = color;
        Trait = trait;
    }

    public Cat(Cat p) {
        this(p.name, p.age, p.gender, p.Color, p.Trait);
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getTrait() {
        return Trait;
    }

    public void setTrait(String trait) {
        Trait = trait;
    }

    public void displayInfo() {
        System.out.println(
                "Name: " + name +
                        "\n Age: " + age +
                        "\n Gender: " + gender +
                        "\n Color: " + Color +
                        "\n Trait: " + Trait
        );
    }
}
