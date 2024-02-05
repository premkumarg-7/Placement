package Placement;/*
move zeros end it has two methods
1. we can give the zeros in end
2. we can swapt the variables to the end
 */
import java.util.Arrays;

public class move_zero {
    public static void main(String[] args) {
        int[] array={0,1,0,3,12};
        System.out.println(Arrays.toString(Move_0s(array)));
    }
//    public static int[] Move_0s(int[] arr){
//        int n= arr.length;
//        int count=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]!=0){
//                arr[count++]=arr[i];
//            }
//        }
//        while(count <n){
//            arr[count++]=0;
//        }
//        return arr;
//    }
    public static int[] Move_0s(int[] arr) {
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swaP(arr ,j,i);
                j++;
            }
        }
        return arr;

    }
    private static void swaP(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
