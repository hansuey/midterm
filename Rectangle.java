package com.mycompany.rectangle;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area() {
        return width*height;
    }

    public double Perimeter() {
        return 2*(width + height);
    }

    public static void main(String[] args) {
        Rectangle att = new Rectangle(14, 7);
        
        System.out.println("Area: " + att.Area());
        System.out.println("Perimeter: " + att.Perimeter());
    }
}

