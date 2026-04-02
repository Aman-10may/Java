import java.util.*;
public class reversearray {
   public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Number of values:");
int n =sc.nextInt();
int[]Arr=new int[n];
System.out.println("Enter the Elements of Array:");
for(int i=0;i<n;i++){
    Arr[i]=sc.nextInt();
}
System.out.println("Array of n number :");
for(int i=0;i<n;i++){
    System.out.println(Arr[i]);
}


   } 
}
