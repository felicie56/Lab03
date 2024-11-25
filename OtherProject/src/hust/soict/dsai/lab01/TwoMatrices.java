import java.util.Scanner;

public class TwoMatrices {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang trong cac ma tran: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot trong cac ma tran: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] FeMatrix = new int[rows][columns];

        System.out.println("Nhap cac phan tu cua ma tran 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("matrix1[%d][%d] = ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhap cac phan tu cua ma tran 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("matrix2[%d][%d] = ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                FeMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Tong cua 2 ma tran la:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(FeMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


