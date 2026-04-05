import java.util.*;
public class TwoDArrays {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows:");
    int r =sc.nextInt();
    System.out.print("Enter the number of columns:");
    int c =sc.nextInt();
    int num =7;
    int[][]arr=new int[r][c];
    for(int i=0;i<r;i++){ //controls row
      for(int j=0;j<c;j++) {//controls column
        arr[i][j]=sc.nextInt();
      } 
    }
    System.out.println("2dArray is :");
    for(int i=0;i<r;i++){ //controls row
      for(int j=0;j<c;j++) {//controls column
        System.out.print(arr[i][j]+" ");
      } 
      System.out.println();
    }
for(int i=0;i<r;i++){ //controls row
      for(int j=0;j<c;j++) {//controls column
        if(num==arr[i][j]){
            System.out.println("Number is found at index :("+i+","+j+")");
            break;
        }
        }
      } 
      
    }




   } 

