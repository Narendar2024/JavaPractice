
class Student{
    static int rollno;
    static String name;
    static int marks;

   static{
    name="Jarvis";
    System.err.println(name);
   }
}


public class StaticClass2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Student");
        
    }
}
