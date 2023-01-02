package Recursion;

public class StepsToMakeANumZero {
    public static void main(String[] args) {
        int n=14;
        System.out.println(totalStepsToZero(n));
    }

    private static int totalStepsToZero(int n) {
        return totalStepsToZero(n,0);
    }

    private static int totalStepsToZero(int n, int count) {
        if(n==1){
            count=count+1;
            return count;
        }
        if(n%2==0){
//            even then divide by 2 for the next call
            return totalStepsToZero(n/2,count+1);
        }else{
            return totalStepsToZero(n-1,count+1);
        }
    }
}
