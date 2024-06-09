class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
  
}

public class StaticDemo {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.brand = "Motorola";
        mobile.price = 30000;
        Mobile.name = "Edge 40 Fusion";

        mobile.show();
    }
}
