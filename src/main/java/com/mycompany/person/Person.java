package com.mycompany.person;

class Person {
    private String name;
    private int age;
    private String address;

public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
}

public void display() {
    System.out.println("Name: " + name + ", Age: " + age);
}

    public static void main(String[] args) {
        Person Person1 = new Person("Bojack Horseman", 50, "Holywoo");
        Person Person2 = new Person("Louise Belcher", 9, "Wonder Wharf");
        Person Person3 = new Person("Budots Godz", 100, "Brgy Disco");
        Person Person4 = new Person("Eric Cartman", 10, "South Park");
        Person Person5 = new Person("Dodong Pawis", 17, "Bermuda Triangle");

        Person1.display();
        Person2.display();
        Person3.display();
        Person4.display();
        Person5.display();
    }
}

