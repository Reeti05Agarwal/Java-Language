package Codes;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        System.out.println(sb.substring(0, 5));
        System.out.println(sb.substring(6));
        System.out.println(sb.indexOf("World"));
        System.out.println(sb.indexOf("World", 7));
        System.out.println(sb.lastIndexOf("l"));
        System.out.println(sb.lastIndexOf("l", 3));
        System.out.println(sb.toString().startsWith("Hello"));
        System.out.println(sb.toString().endsWith("World"));
        System.out.println(sb.toString().contains("World"));
        System.out.println(sb.equals("Hello World"));
        System.out.println(sb.toString().equalsIgnoreCase("hello world"));
        System.out.println(sb.append(" Java"));
        System.out.println(sb.insert(5, " Java"));
        System.out.println(sb.delete(5, 10));
        System.out.println(sb.reverse());
    }
}
