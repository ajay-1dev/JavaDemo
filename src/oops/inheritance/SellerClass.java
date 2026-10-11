package oops.inheritance;

public class SellerClass extends User {
    SellerClass(String username,String email){
        super(username,email);
    }
    void addProducts(){
        System.out.println("Seller is adding a new product");
    }
    // Method overriding means redefining a parent class method in a child class.
    // If the method name or parameters do not exactly match the parent method,
    // @Override will give a compile-time error.

    @Override
    void ShowDashboard(){
        System.out.println("Seller Dashboard");
    }
    public static void main(String[] args) {
        SellerClass su = new SellerClass("ramesh singh","2");
        su.ShowDashboard();;
    }
}
