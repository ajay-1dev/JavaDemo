package oops.AbstractDemo;

public class Electronics extends Product{

    public Electronics(String name , double price){
        super(name,price);
    }
    @Override
    double calculateDiscount() {
        return price*0.1; // suppose if you want to give 100%off then formula 100 *0.1 = 10
    }

    @Override
    double calculateTax() {
        return price *0.15;
    }

    @Override
    double calculateShippingCost() {
        return 10.0;
    }

    double something(){
        return 1.0;
    }
}
