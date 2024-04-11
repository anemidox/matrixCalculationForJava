import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row and column size of matrix1: ");
        System.out.println("Number of Rows : ");
        int row1 = scanner.nextInt();
        System.out.println("Number of Columns : ");
        int column1 = scanner.nextInt();

        System.out.println(row1 + " x " + column1 + " matrix");

        int[][] matrix1 = new int[row1][column1];

        System.out.println("Enter elements of matrix1: ");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.println("Enter element at position " + (i + 1) + " " + (j + 1));
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter row and column size of matrix2: ");
        System.out.println("Number of Rows : ");
        int row2 = scanner.nextInt();
        System.out.println("Number of Columns : ");
        int column2 = scanner.nextInt();

        System.out.println(row2 + " x " + column2 + " matrix");

        int[][] matrix2 = new int[row2][column2];

        System.out.println("Enter elements of matrix2: ");

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.println("Enter element at position " + (i + 1) + " " + (j + 1));
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Check if matrices can be added
        if (row1 == row2 && column1 == column2) {
            int[][] sum = new int[row1][column1];

            // Perform matrix addition
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Display the sum matrix
            System.out.println("Sum of two matrices: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices cannot be added");
        }

        scanner.close();
    }
}
