package com.csc113.project;

public abstract class Pet {
    protected String name;
    protected int age;
    protected String gender;

    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Pet(Pet p) {
        this(p.name, p.age, p.gender);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void displayInfo();
}
