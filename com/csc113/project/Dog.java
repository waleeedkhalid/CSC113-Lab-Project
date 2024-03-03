package com.csc113.project;

public class Dog extends Pet {
    private String Size;
    private String Breed;

    public Dog(String name, int age, String gender, String Size, String Breed) {
        super(name, age, gender);
        this.Size = Size;
        this.Breed = Breed;
    }

    public Dog(Dog p) {
        this(p.name, p.age, p.gender, p.Size, p.Breed);
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public void displayInfo() {
        System.out.println(
                "Name: " + name +
                "\n Age: " + age +
                "\n Gender: " + gender +
                "\n Size: " + Size +
                "\n Breed: " + Breed
        );
    }
}
