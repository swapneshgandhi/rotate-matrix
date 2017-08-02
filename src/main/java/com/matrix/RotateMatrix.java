package com.matrix;

public class RotateMatrix<T> {

    public void rotate(T[][] matrix) {

        //do transpose of matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                T tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        //reverse each row.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                T tmp = matrix[i][matrix[0].length - 1]; //;
                matrix[i][matrix[0].length - 1] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }

    }


    public void printMatrix(T[][] matrix) {

        for (T[] row : matrix) {
            for (T num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}


class RunRotateMatrix {

    public static void main(String[] args) {
        RotateMatrix<Integer> rotateM = new RotateMatrix<>();

        Integer[][] matrix = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

        System.out.println("Matrix before rotating...");
        rotateM.printMatrix(matrix);

        rotateM.rotate(matrix);
        System.out.println("Matrix after rotating...");
        rotateM.printMatrix(matrix);
    }

}
