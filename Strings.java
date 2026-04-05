//there many concept here so,before running one make other comment out!!!
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        String fullName= firstName+"@"+lastName;
       //LENGTH OF STRING
        System.out.println(fullName.length());
        //CHARAT
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        } 
       //COMPARE
       if(firstName.compareTo(lastName)==0){
        System.out.println("String are Equal");
       }
       else{
        System.out.println("String are not equal");
       }
    
    //SUBSTRING
    String sentence ="My name is Aman";
    
    String name = sentence.substring(0,4);
    System.out.println(name);



    }
}
