package Placement;

/*
Find the Missing number in array
 */
public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n=5;
        Missing_number obj = new Missing_number();
        System.out.println(obj.find_number(arr ,n));
    }
    private int find_number(int[] nums ,int n){
        int sum=0;
        int ttl_value=n*(n+1)/2;
        for (int num : nums) {
            sum += num;
        }
        return ttl_value-sum;
    }
}
