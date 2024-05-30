class Mobile{
    String brand;
    int price;
    static String name;

    

    public Mobile(){
        brand="";
        price=20000;
        System.out.println("It is Contructor");
    }

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

    static {
        name = "phone";
        System.out.println("this is static block");
    }

  
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException{

        Class.forName("Mobile");
        
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Motorola";
        // obj1.price = 25000;
        // Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        // Mobile obj3 = new Mobile();
    }
}
