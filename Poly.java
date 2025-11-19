package Codes;

class Parent {
    void show() { System.out.println("Parent method"); }
    void displatme() { System.out.println("Concrete Parent method"); }
    static void parentDisplay() { System.out.println("Static Parent method"); }
    // static is always resolved as compile time and hence cannot be dynamic
}
class Child extends Parent {
    // No overriding
    void show() { System.out.println("Child method"); }
    void display() { System.out.println("Concrete Child method"); }
    // void parentDisplay() { System.out.println("Static Child method"); }
    // Static methods cannot be overridden
}
public class Poly {
    public static void main(String[] args) {
        Parent obj = new Child(); // updasting
        Child childobj = (Child) obj; // downcasting
        Child obj2 = new Child(); //normally initiating the class
        obj.show(); 

        childobj.display();
        
        childobj.parentDisplay();
        
        obj.displatme();
        
        
        // obj.display(); // Error

        obj2.display();
        obj2.parentDisplay();

        // conclusion is that downcasting and normal class initializing is same thing
    }
}

 
