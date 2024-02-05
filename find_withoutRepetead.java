package Placement;

public class find_withoutRepetead {
    public static void main(String[] args) {
        int[] arr={4,4,9,1,2,1,2};
     System.out.println(find_singleOne(arr));
    }
    private static int find_singleOne(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(i==j) continue;
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==0) return arr[i];
        }
        return 0;
    }
}
