package Placement;

public class Climbing_stairs {
    /*
    count the ways to climb the stairs
    there are two ways
    1,using recursion
    2. using loop
     */
    public static void main(String[] args) {
        int n=15;
        System.out.println(steps(n));
    }
//    public static int steps(int n){
//        if(n<=2){
//            return n;
//        }
//        return steps(n-1)+steps(n-2);
//    }
    public static int steps(int n){
        int prev1=1;
        int prev2=1;
        for(int i=2;i<=n;i++){
           int curr =prev1+prev2;
           prev2=prev1;
           prev1=curr;
        }
        return prev1;
    }
}
