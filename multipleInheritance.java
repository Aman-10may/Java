interface Animal{
    public void walk();

}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
   public void walk(){
    System.out.println("walks on 4 leg");
   }

}

public class multipleInheritance {
 public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
 }
}
