package Inheritance;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Teacher {
    String Teacher_name = "";
    Student[] student_array ;
//    String name = "NAME in Teache";
    public Teacher(String Teacher_name, int number_of_student){
        this.Teacher_name = Teacher_name;
        student_array = new Student[number_of_student];

        for(int i = 0; i < number_of_student; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your student name");
            String name = sc.nextLine();
            System.out.println("Enter your student email");
            String email = sc.nextLine();
            Student st = new Student(name, email);
            student_array[i] = st;
        }
    }

    public void show_data(){
//        number = 120;
//        System.out.println(name);
//        System.out.println("Student Name : "+super.name);
//        System.out.println("Student Email : "+email);
        System.out.println("Teacher Name : "+Teacher_name);
        System.out.println("Students under Teacher : "+ student_array.length);
        for(int i = 0; i<student_array.length; i++){
            System.out.println("Name of Student : "+student_array[i].getName());
            System.out.println("Email of Student : "+student_array[i].getEmail());
        }


//        System.out.println("Student Teacher Name : "+number);
//        subject();
    }

//*********************************************************************

//    Polyorphisam : one function or variable have many forms
//    Method overriding
    public void subject(){
//        super.subject();
        System.out.println("Arts");
        System.out.println("Maths");
    }

//    Method overloading
    public void subject(String name_sub){

        System.out.println("Subject Name : "+name_sub);

    }
    //***********************************************************************



    public static void main(String[] args) {
//        Teacher t = new Teacher("Ankit", "Deepa", "deepa@som");
//        t.show_data();
//        t.subject("Maths");
        Teacher t = new Teacher("Ankit", 2);
        t.show_data();

        Teacher t1 = new Teacher("Ankita", 3);
        t1.show_data();
    }
}
