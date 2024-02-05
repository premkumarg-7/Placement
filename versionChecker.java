package Placement;

import java.util.Scanner;
/*
get the input from user version1 and version2
pass the arguments in parameters
movet to the method
store the string to array1 and array2
initialize variable sum =0 for store the values
use for loop to iterate
we should ignore the '.' so use if condition to ignore '.'
and ignore the leading zeros so adding the num in sum and subtract the zero
exit the loop
check the given condition sum1<sum2 return -1;
sum>sum2 return 1;
otherwise return 0;
 */
public class versionChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  version 1:");
        String v1= sc.nextLine();
        System.out.println("Enter the version 2 :");
        String v2= sc.nextLine();
        System.out.println(versioncheck(v1,v2));
    }
    static  int versioncheck(String v1,String v2){
        char[] arr1= v1.toCharArray();
        char[] arr2= v2.toCharArray();

        int sum1=0;
        int sum2=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!='.'){
                sum1+=arr1[i]-'0';
            }
            if(arr2[i]!='.'){
                sum2+=arr2[i]-'0';
            }
        }
        if (sum1 <sum2) {
            return -1;
        }else if(sum1>sum2){
            return 1;
        }
        return 0;
    }
}
