class Person{
    private String name;
    private int age;
    
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


public class Dummy {

    public static void main(String[] args) {

        Person obj = new Person();
        obj.setName("Edith");
        obj.setAge(22);
        
        System.out.println(obj.getName()+obj.getAge());
    }
}
