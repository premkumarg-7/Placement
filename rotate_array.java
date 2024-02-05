package Placement;

import java.util.Arrays;
/*
right rotated array kth time
 */
public class rotate_array {
    public static void main(String[] args) {
       // int[] array= {-1,-100,3,99};
        int[] array ={1,2,3,4,5,6,7};
        int k=3;

        System.out.println(Arrays.toString(right_rotate(array, k)));
    }
    public static int[] right_rotate(int[] arr,int k){
        int val= arr.length-k;
        int[] result= new int[arr.length];
        int start =0;
        for(int i=val;i< arr.length;i++){
            result[start++]=arr[i];
        }
        for (int i = 0; i <val; i++) {
            result[start++]=arr[i];
        }
        return result;
    }
}
