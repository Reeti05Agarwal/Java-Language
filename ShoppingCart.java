package Codes;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Product{
    String pname;
    double price;

    Product(String pname, double price){
        this.pname = pname;
        this.price = price;
    }
}

class ShoppingList{
    Map<Product, Integer> Cart = new HashMap<Product, Integer>();

    void addProduct(Product product, Integer quantity){
        Cart.put(product, quantity);
    }

    void removeProduct(Product product, Integer quantity){
        if (Cart.containsKey(product)){
            Cart.remove(product, quantity);
        }
        else{
            System.out.println("Product not found in the Cart");
        }
        
    }

    Integer totalCost(Map<Product, Integer> Cart){
        int total = 0;
        for (Map.Entry<Product, Integer> entry : Cart.entrySet()) {
            total += entry.getKey().price * entry.getValue();
        }
        return total;
    }
    
}

public class ShoppingCart {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product("", 0.0);
        ShoppingList sh = new ShoppingList();
        
        System.out.println("1. Add Products \n2. Remove Products \n3. Show Total Cost \n4. Display Cart \n5. Exit");
        Integer options = sc.nextInt();
        boolean keepGoing = true;
        while (keepGoing){
            switch (options) {
                case 1:
                    System.out.println("Number of Products you want to buy: ");
                    Integer Addno = sc.nextInt();
                    for (int i=0; i<Addno; i++){
                        System.out.println("Enter Product Name: ");
                        String pname = sc.nextLine();
                        System.out.println("Enter Price: ");
                        Double price = sc.nextDouble();
                        System.out.println("Enter Quantity: ");
                        Integer quantity = sc.nextInt();
                        p.pname = pname;
                        p.price = price;
            
                        sh.addProduct(p, quantity);
                    }
                    break;
            
                case 2:
                    System.out.println("Number of Products you want to Remove: ");
                    Integer Removeno = sc.nextInt();
                    for (int i=0; i<Removeno; i++){
                        System.out.println("Enter Product Name: ");
                        String pname = sc.nextLine();

                        
                    }
                case 3:

                case 4:


                default:
                    keepGoing = false;
                    break;
            }
        }
        sc.close();


        

    }

    public void addingInCart(){
        
    }


     

 
}
