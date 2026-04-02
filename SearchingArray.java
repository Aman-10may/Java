import java.util.Scanner;
public class SearchingArray{
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the size of array : ");
    int Size=sc.nextInt();
    int Arr[]=new int[Size] ;
    
    for(int i=0;i<Size;i++){
         Arr[i] =sc.nextInt();
    }
    System.out.print("Enter the number to search :");
    int N =sc.nextInt();
    for(int i=0;i<Size;i++){
        if(Arr[i]==N){
            System.out.println("The number found at index:"+i);
            break;
        }
    }
   }
}
