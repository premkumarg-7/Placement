package Placement;

import java.util.Scanner;
/*
find the repeated variable in array in twice without extra space
 */
public class repeated_nums {
    public static void main(String[] args) {
        //int[] nums={1,3,4,2,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array length");
        int len = sc.nextInt();
        int[] nums= new int[len];
        System.out.println("Enter the values");
        for (int i = 0; i < len; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(find_dublicate(nums));

    }
    private static int find_dublicate(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length;j++){
                if(i==j) continue;
                if(arr[i]==arr[j]) return arr[i];
            }
        }
        return 0;
    }
}
