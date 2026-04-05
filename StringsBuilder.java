import java.util.*;
public class StringsBuilder {
   public static void main(String[] args) {
    StringBuilder sb =new StringBuilder("Aman");
    System.out.println(sb);
    
    //Char at index 0
    System.out.println(sb.charAt(0));

    //set char at index 0
    sb.setCharAt(0,'p');
    System.out.println(sb);

    //Insertion of char
    sb.insert(0,'S');
    System.out.println(sb);
    sb.insert(2,'n');
    System.out.println(sb);

    //Delete of char in string
    sb.delete(0,1);
    System.out.println(sb);
    sb.delete(2,4);
    System.out.println(sb);

//Append
sb.append("h");
sb.append("e");
sb.append("l");
sb.append("l");
sb.append("o");
System.out.println(sb);

//length of string
System.out.println(sb.length());

//reverse of string
StringBuilder ab=new StringBuilder("hello");
System.out.println(ab);
for(int i=0;i<ab.length()/2;i++){
    int front = i;
    int back = ab.length()-1-i;

    char frontChar =ab.charAt(front);
    char backChar =ab.charAt(back);
    ab.setCharAt(front ,backChar);
    ab.setCharAt(back,frontChar);  
}
System.out.println(ab);

   } 
}
