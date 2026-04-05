public class Factorial {
   public static void Fact(int n){
    int factorial=1;
    if(n<0){
        System.out.println("Invalid Number ");
        return;
    }
    for(int i=n;i>=1;i--){
       
        factorial=factorial*i;
    }
    System.out.println(factorial);
}
    public static void main(String args[]){
        int n =7;
         Fact(n);
        
   } 
}
