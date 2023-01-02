package Recursion;

public class ReverseANum {
    public static void main(String[] args) {
        int n=4281;
//        System.out.println((int)Math.log10(n));
//        int digits=(int)Math.log10(n);
//        System.out.println((int)Math.pow(10,digits-1));
        System.out.println(reverseAnotherWay(n));
//    reverseANumWayOne(n);
    }
    static int ans=0;
    private static void reverseANumWayOne(int n) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        int rem=n%10;
        ans=ans*10+rem;
         reverseANumWayOne(n/10);

    }
    private static int  reverseAnotherWay(int n){
        int digits= (int) Math.log10(n)+1;
        return reverseAnotherWay(n,digits);
    }

    private static int reverseAnotherWay(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int remainder=n%10;
        return remainder*(int)Math.pow(10,digits-1)+reverseAnotherWay(n/10,digits-1);
    }
}
