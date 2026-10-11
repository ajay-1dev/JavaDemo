package oops.AbstractDemo;

public class OnlineStore {
    public static void main(String[] args) {
        Product electronics = new Electronics("Smartphone",500);
        Product clothing = new Clothing("T-shirt",200);
        Electronics electronics2 = new Electronics("a", 10);
        System.out.println(electronics.calculateTax());
        System.out.println(clothing.calculateTax());
        System.out.println(electronics2.something());
    }
}
