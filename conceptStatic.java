class Student { // static used for sharing among all objects
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class conceptStatic {
    public static void main(String[] args) {
        Student.school = "JMV";   // static variable access

        Student s1 = new Student();  
        s1.name = "luffy";

        System.out.println(s1.school); 
    }
}