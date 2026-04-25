//Class1
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
System.out.println(this.color);// this defines which object is calling.
    }

}
//Class2
class Student{
    String name;
    int age;
    public void printInfo(){
System.out.println(this.name);
System.out.println(this.age);

}
// NON-PARAMETER CONSTRUCTOR
Student(){ 
    System.out.println("Constructor Called");
}

Student(Student s2){
this.name=s2.name;
this.age=s2.age;
}
}

//Class3
class Employe{
    String name;
    int age;
    public void printInfo(){
System.out.println(this.name);
System.out.println(this.age);
}
//Parameter Constructor 
 Employe(String name , int age ){
this.name=name;
this.age=age;
 }
}

public class oops {
 public static void main(String[] args) {
    Pen pen1=new Pen();
    pen1.color="blue";
    pen1.type="gel";
    pen1.write();

    Pen pen2=new Pen();
    pen2.color="black";
    pen2.type="ball";
    
    pen1.printColor();
    pen2.printColor();


    Student s1= new Student();
    s1.name="Aman";
    s1.age=19;
    s1.printInfo();
    Student s2= new Student();
    s2.name="Shivam";
    s2.age=20;
    s2.printInfo();
    Student s3= new Student(s2);
    s3.printInfo();


    Employe e1=new Employe("aman",24);
    e1.printInfo();
 }   
}
