package Placement;

import java.util.HashSet;

public class UnionSet {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,5};
        int n1=arr1.length;
        int n2 = arr2.length;

        System.out.println(doUnionsize(arr1,n1,arr2,n2));
    }
    private static int doUnionsize(int[] arr1, int n1 ,int[] arr2, int n2){
        HashSet<Integer> hs = new HashSet<>();

        for(int i:arr1){
            hs.add(i);
        }
        for(int j:arr2){
            hs.add(j);
        }
        System.out.println("Just return the size of the Union Array using HashSet");
        return hs.size();
    }

}
