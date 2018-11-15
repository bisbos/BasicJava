package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixZero {

    public static void main(String[] args) {


        int[][] matrix = {{1,2,0,6},{4,7,6},{7,8,9,7}};
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (Integer row:rows){
           for (int j=0;j<matrix[row].length;j++){
               matrix[row][j]=0;
           }
        }

        for (Integer column:columns){
            for (int i=0;i<matrix.length;i++){
                matrix[i][column] =0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
