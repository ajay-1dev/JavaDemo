package oops.AbstractDemo;
public class Clothing extends Product{
    public Clothing(String name,double price){
        super(name,price);
    }
    @Override
    double calculateDiscount() {
        return price * 0.2;
    }

    @Override
    double calculateTax() {
        return price * 0.8;
    }

    @Override
    double calculateShippingCost() {
        return price * 0.5;
    }
}
