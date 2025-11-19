package Codes;

class parent{
    void show(){
        System.out.println("Parent's show()");
    }
}

class child extends parent{
    @Override
    void show(){
        System.out.println("child show method");
    }
}

public class Updaste {
    public static void main(String[] args) {
        parent obj = new child();
        obj.show();
    }
}
