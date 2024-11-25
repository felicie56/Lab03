import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so phan tu: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Hay nhap so duong.");
                return;
            }

            int[] numbers = new int[n];

            System.out.println("Hay nhap so: " + n );
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            Arrays.sort(numbers);

            System.out.println("Sap xep tu nho toi lon: " + Arrays.toString(numbers));
            System.out.println("Tong: " + sum);
            System.out.println("Trung binh: " + (double) sum / n);
        }
    }
}
