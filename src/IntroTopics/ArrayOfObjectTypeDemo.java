package IntroTopics;

public class ArrayOfObjectTypeDemo {
    public static void main(String[] args) {
    Student[] students = new Student[3];
    students[0] = new Student(1,"ali");
    students[1] =  new Student(2,"ram");
    students[2] = new Student(3,"charan");
    for(int i=0;i<students.length;i++){
        System.out.println(students[i].id+","+students[i].name);
    }
        System.out.println("iterating using for each loop");
    for(Student s:students){
        System.out.println(s.id+","+s.name);
    }
    }
}
class Student{
    int id;
    String name;
    Student(int id , String name){
        this.id =  id;
        this.name = name;
    }
}
