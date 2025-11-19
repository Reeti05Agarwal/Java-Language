package Codes;

interface Animal{
    void sound();
    //no concrete methods
}

class Dog implements Animal{
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interfaces {
    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
    }
}
