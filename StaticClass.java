class Student{
    int rollno;
    String name;
    int marks;

    static class StudentDetails{
        void printStudentDetails(Student student){
            System.out.println("Roll No: "+student.rollno);
            System.out.println("Name: "+student.name);
            System.out.println("Marks: "+student.marks);
        }
        
    }
}


public class StaticClass {

    public static void main(String[] args) /*throws ClassNotFoundException*/{

        // Class.forName("Student");

        Student obj1 = new Student();

        obj1.rollno = 1;
        obj1.name = "Jarvis";
        obj1.marks = 40;
        
        Student.StudentDetails details = new Student.StudentDetails();
        details.printStudentDetails(obj1);
    }
}
