class Employee{
    private String name;
    private int age;

    //Constructor
    public Employee(){
        name = "Narender";
        age = 23;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
 
}

public class Constructor {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setName("Jai");
        obj.setAge(23);

        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
    }
}
