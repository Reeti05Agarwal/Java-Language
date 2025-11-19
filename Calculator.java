package Codes;

class cal{
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
}

public class Calculator {
    public static void main(String[] args) {
        cal c = new cal();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2.5, 3.5));
        System.out.println(c.add(2, 3, 4));
        
    }
}
