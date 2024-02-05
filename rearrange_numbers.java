package Placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
program to rearranage the numbers

 */
public class rearrange_numbers
{
    public static void main(String[] args) {
       // int[] nums={3,4,5,1,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrayLength :");
        int len = sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter the Valules in Array");
        for (int i = 0; i <len ; i++) {
            nums[i]=sc.nextInt();
        }
        int[] output=rearrange_Numbers(nums);
        System.out.println(Arrays.toString(output));
    }
    static int[] rearrange_Numbers(int[] nums){
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int[] result= new int[nums.length];
        for(int var:nums){
            if(var%2==0){
                even.add(var);
            }else{
                odd.add(var);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int even_start=0;
        int odd_start=odd.size()-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                result[i]=even.get(even_start++);
            }
            else{
                result[i]=odd.get(odd_start--);
            }
        }
        return result;
    }
}
