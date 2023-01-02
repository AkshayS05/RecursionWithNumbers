package Recursion;

public class RecursionQ1 {
    public static void main(String[] args) {
        int n=5;
        printTill(n);
    }

    private static void printTill(int n) {
if(n==0){
    return;
}
        System.out.print(n+" ");

        printTill(n-1);
        System.out.print(n+" ");
    }
}
