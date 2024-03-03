package com.csc113.project;

public class TestShelter {
    public static void main(String[] args) {
        Shelter A = new Shelter("AbodShelter", 10);

        Parrot p = new Parrot("ParrotName", 100, "Male", true, "SSS");
        Cat c = new Cat("CatName", 2, "Female", "White", "Friendly");
        Dog d = new Dog("DogName", 5, "Male", "Gray", "Angry");

        Parrot p2 = new Parrot("ParrotName2", 110, "Male", true, "SSS2");
        Cat c2 = new Cat("CatName2", 12, "Female", "White", "Friendly");
        Dog d2 = new Dog("DogName2", 51, "Male", "Gray", "Angry");

        Parrot p3 = new Parrot("ParrotName3", 130, "Male", true, "SSS3");


        A.addPet(p);
        A.addPet(c);
        A.addPet(d);
        A.addPet(p2);
        A.addPet(c2);
        A.addPet(d2);
        A.addPet(p3);

//        A.displayInfo();
//
//        A.adoptPet(c);
//        A.displayInfo();

        System.out.println(A.getTotalPetsByType("Parrot"));

    }
}
