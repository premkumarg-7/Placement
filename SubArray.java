package Placement;

import java.util.ArrayList;
import java.util.Scanner;
/*
Find Maxsum the SubArray
 */
public class SubArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values :");
        while(true){
            int element = sc.nextInt();
            if (element==0) break;
            arr.add(element);
        }
        int k=2;
        int n=arr.size();
        System.out.println(maximumsubarray(k,arr,n));
    }
    private static long maximumsubarray(int k, ArrayList<Integer> arr, int n){
        int maxsum=0;
        int currsum=0;
        for (int i = 0; i < k; i++) {
            currsum+=arr.get(i);
        }
        maxsum=currsum;
        for (int i = 1; i < n-k+1; i++) {
            currsum=currsum-arr.get(i-1)+arr.get(i+k-1);
            if(maxsum < currsum) maxsum=currsum;
        }
        return maxsum;
    }
}
