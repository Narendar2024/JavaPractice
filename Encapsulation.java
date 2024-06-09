class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name,Person obj){
        Person obj1 = obj;
        obj1.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age, Person obj){
        Person obj1 = obj;
        obj1.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Jarvis",obj);
        obj.setAge(23,obj);
        System.out.println("Name: "+obj.getName()+" Age: "+obj.getAge());
    }
}
