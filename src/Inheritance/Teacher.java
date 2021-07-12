package Inheritance;

import java.sql.SQLOutput;

public class Teacher extends Student{
    String Teacher_name = "";
    String name = "NAME in Teache";
    public Teacher(String Teacher_name, String name, String email){
        super(name, email);
        this.Teacher_name = Teacher_name;
    }

    public void show_data(){
        number = 120;
        System.out.println("Student Name : "+super.name);
        System.out.println("Student Email : "+email);
        System.out.println("Student Teacher Name : "+Teacher_name);
//        System.out.println("Student Teacher Name : "+number);
//        subject();
    }

//*********************************************************************

//    Polyorphisam : one function or variable have many forms
//    Method overriding
    public void subject(){
        super.subject();
        System.out.println("Arts");
        System.out.println("Maths");
    }

//    Method overloading
    public void subject(String name_sub){

        System.out.println("Subject Name : "+name_sub);

    }
    //***********************************************************************



    public static void main(String[] args) {
        Teacher t = new Teacher("Ankit", "Deepa", "deepa@som");
        t.show_data();
        t.subject("Maths");
    }
}
