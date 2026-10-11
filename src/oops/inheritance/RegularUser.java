package oops.inheritance;

public class RegularUser extends User{
    public RegularUser(String username,String email){
        super(username,email);
    }
    public void browseProducts(){
        System.out.println("Customer is browsing the products");
    }
    // Method overriding means redefining a parent class method in a child class.
    // If the method name or parameters do not exactly match the parent method,
    // @Override will give a compile-time error.

    @Override
    void ShowDashboard(){
        System.out.println("Regular Dashboard");
    }

    public static void main(String[] args) {
        RegularUser ru = new RegularUser("anup","anup123@gmail.com");
        ru.login();
        ru.browseProducts();
    }
}
