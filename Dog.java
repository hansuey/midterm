package com.mycompany.dog;

class Dog {
    private String name;
    private String breed;
    
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;        
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void reveal() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
    
    public static void main(String[] args) {
        Dog d1 = new Dog("Enya", "Golden Retriever");
        Dog d2 = new Dog("Odi", "Shih Tzu");
        
        d1.setName("Koko");
        d1.setBreed("Shih Tzu");
        d2.setBreed("Aspin");
        d2.setName("Duday");
        
        d1.reveal();
        d2.reveal();
             
    }
}