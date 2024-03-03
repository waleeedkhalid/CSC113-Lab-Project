package com.csc113.project;

public class Shelter {
    private String name;
    private Pet pets[];
    private int petscount;

    public Shelter(String name, int size) {
        this.name = name;
        this.pets = new Pet[size];
        this.petscount = 0;
    }

    public boolean addPet(Pet p) {
        if (petscount >= pets.length) return false;

        if(searchPet(p.getName()) != -1) return false;

        if (p instanceof Parrot) {
            pets[petscount] = new Parrot((Parrot) p);
        } else if (p instanceof Dog) {
            pets[petscount] = new Dog((Dog) p);
        } else if (p instanceof Cat) {
            pets[petscount] = new Cat((Cat) p);
        }
        petscount++;
        return true;
    }

    public int searchPet(String name) {
        for (int i = 0; i < petscount; i++) {
            if(pets[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adoptPet(Pet p) {
        int PetIndex = searchPet(p.getName());
        if(PetIndex == -1) return false;

        pets[PetIndex] = pets[petscount-1];
        petscount--;
        return true;
    }

    public int getTotalPetsByType(String Type) {
        int total = 0;
        for (int i = 0; i < petscount; i++) {
            if (pets[i] instanceof Parrot && Type.equalsIgnoreCase("Parrot")) {
                total++;
            } else if (pets[i] instanceof Dog && Type.equalsIgnoreCase("Dog")) {
                total++;
            } else if (pets[i] instanceof Cat && Type.equalsIgnoreCase("Cat")) {
                total++;
            }
        }
        return total;
    }

    public void displayInfo() {
        System.out.println(name+" ("+petscount+"): ");
        for (int i = 0; i < petscount; i++) {
            System.out.print("-");
            pets[i].displayInfo();
        }
    }
}
