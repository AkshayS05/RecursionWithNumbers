package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n=300204;
        System.out.println(NumOfZeros(n));
    }
    private static int NumOfZeros(int n) {
    return NumOfZeros(n,0);
    }

    private static int NumOfZeros(int n,int count) {
        if(n==0){
               return count;
        }
       if(n%10==0){
         return NumOfZeros(n/10,count+1);
        }else{
           return NumOfZeros(n/10,count);
       }
    }
}
