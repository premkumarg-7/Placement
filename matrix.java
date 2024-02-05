package Placement;

import java.util.Arrays;
/*
Given Matrix
1 2 3
4 5 6
7 8 9

the method should solve combination of diagonal and snake pattern
Result : [1, 2, 4, 7, 5, 3, 6, 8, 9]
 */
public class matrix {
    public static void main(String[] args) {
        int row=3,col=3;
        int[][] Matrix = new int[row][col];
        int count=1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Matrix[i][j]=count++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(diagonal_pattern(Matrix)));
    }
    private static int[] diagonal_pattern(int[][] Matrix){
        if(Matrix.length==0 || Matrix[0].length==0) return new int[0];
        int m=Matrix.length ,n=Matrix[0].length;
        int i=0;
        int row=0,col=0;
        int[] result = new int[m*n];
        boolean up= true;

        while(row<m && col<n){
            if(up){
                while(row>0 && col<n-1){
                    result[i++]=Matrix[row][col];
                    row--;
                    col++;
                }
                result[i++]=Matrix[row][col];
                if(col==n-1){
                    row++;
                }else{
                    col++;
                }
            }else{//down
                while(col>0 && row<m-1){
                    result[i++]=Matrix[row][col];
                    row++;
                    col--;
                }
                result[i++]=Matrix[row][col];
                if(row==m-1){
                    col++;
                }else{
                    row++;
                }

            }
                up=!up;
        }
        return result;

    }
}
