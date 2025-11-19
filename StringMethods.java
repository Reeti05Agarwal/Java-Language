package Codes;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("World", 7));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.lastIndexOf("l", 3));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));
        System.out.println(str.contains("World"));
        System.out.println(str.equals("Hello World"));
        System.out.println(str.equalsIgnoreCase("hello world"));
        System.out.println(str.compareTo("Hello World"));
        System.out.println(str.compareToIgnoreCase("hello world"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.replace("World", "Java"));
        System.out.println(str.concat(" Java"));
        System.out.println(str + " Java");
    }
    
}
