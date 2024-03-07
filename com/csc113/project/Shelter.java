package com.csc113.project;

public class Shelter {
    private String name;
    private Pet pets[];
    private int petscount;

    public Shelter(String name) {
        this.name = name;
        this.pets = new Pet[10];
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet(int index) {
        if(index > petscount) return null;
        return pets[index];
    }

    public void displayInfo() {
        System.out.println(name+" ("+petscount+"): ");
        for (int i = 0; i < petscount; i++) {
            System.out.print("-");
            pets[i].displayInfo();
        }
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public int getPetscount() {
        return petscount;
    }

    public void setPetscount(int petscount) {
        this.petscount = petscount;
    }
}
