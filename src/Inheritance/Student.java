package Inheritance;

public class Student {
    private String name = "";
    private String email = "";
//    int number = 123;
    public Student(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void subject(){
        System.out.println("Hindi English");
        System.out.println("Sanskrit");
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
