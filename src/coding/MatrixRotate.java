package coding;

import java.util.Arrays;

public class MatrixRotate {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));

        tarnsposeMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));

        rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    static void tarnsposeMatrix(int[][] matrix){
        for (int row=0;row<matrix.length;row++){
            for (int column=row;column<matrix[row].length;column++){
                int temp = matrix[column][row];
                matrix[column][row] = matrix[row][column];
                matrix[row][column] = temp;
            }
        }
    }

    static void rotateMatrix(int[][] matrix){
        for (int row =0;row<matrix.length;row++){
            for (int columnStart =0,columnEnd = matrix[row].length-1; columnStart<columnEnd; columnStart++,columnEnd--){
                int temp = matrix[columnStart][row];
                matrix[columnStart][row] = matrix[columnEnd][row];
                matrix[columnEnd][row]=temp;
            }
        }
    }
}
