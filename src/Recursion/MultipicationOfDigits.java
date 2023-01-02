package Recursion;

public class MultipicationOfDigits {
    public static void main(String[] args) {
        int n=21342;
        System.out.println(multipicationOfDigits(n));
    }

    private static int multipicationOfDigits(int n) {
        if(n%10==n){
            return n;
        }
        return n%10*(multipicationOfDigits(n/10));
    }
}
