class Student{
    int rollno;
    String name;
    int marks;
}

public class ObjectArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno=1;
        s1.name="Jarvis";
        s1.marks=87;
        
        Student s2 = new Student();
        s2.rollno=2;
        s2.name="Friday";
        s2.marks=90;
        
        Student s3 = new Student();
        s3.rollno=3;
        s3.name="Edith";
        s3.marks=89;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0; i<students.length; i++){
            // System.err.println(students[i].rollno+" "+students[i].name+"    "+students[i].marks);
        }

        for(Student n:students){
            System.out.println(n.rollno+"   "+n.name+"  "+n.marks);
        }
        
    }
}
