class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Motorola";
        obj1.price = 30000;
        Mobile.name = "SmartPhone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Iqoo";
        obj2.price = 35000;
        Mobile.name = "SmartPhone";

        // Mobile.name="Phone";

        obj1.show();
        obj2.show();

    }
}
