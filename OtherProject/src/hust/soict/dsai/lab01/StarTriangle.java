import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu cao cua tam giac (n): ");
        int FLC = scanner.nextInt();

        for (int i = 1; i <= FLC; i++) {
            for (int j = FLC - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        scanner.close();
    }
}
