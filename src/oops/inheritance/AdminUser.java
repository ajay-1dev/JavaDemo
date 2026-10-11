package oops.inheritance;

public class AdminUser extends User {
    public AdminUser(String username,String email){
        super(username,email);
        System.out.println("Super keyword working fine");
    }
    public void manageProducts(){
        System.out.println("Admin is managing products");
    }
    // Method overriding means redefining a parent class method in a child class.
    // If the method name or parameters do not exactly match the parent method,
    // @Override will give a compile-time error.

    @Override
    public void ShowDashboard(){
        super.ShowDashboard();
        System.out.println("Adminuser Dashboard : "+getUsername());
    }
    public static void main(String[] args) {
        AdminUser au = new AdminUser("riys98","riya98@gmail.com");
        au.login();
        au.ShowDashboard();;
    }
}


// inheritance used only on is a relationship
