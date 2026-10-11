package oops;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("The name is : "+obj.name);
        Main obj1 = new Main("c++");
        Main obj2 = new Main(1,"Arun");
    }
    private String name;
    private int id;
    //no argument constructor
    Main(){
        System.out.println("Constructor called");
        name = "Dummy";
    }
    //parameterised constructor
    Main(String lang){
        name = lang;
        System.out.println(name+" is a programming language");
    }
    Main(int id,String name){
        id=id;
        name=name;
        System.out.println(id+":"+name);

    }
}
