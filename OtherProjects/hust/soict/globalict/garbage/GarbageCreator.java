package hust.soict.dsai.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        String result = "";
        long startTime = System.nanoTime();
        
        // Tạo "rác" bằng cách nối chuỗi sử dụng toán tử '+'
        for (int i = 0; i < 100000; i++) {
            result += "Some string to add garbage " + i + " ";
        }

        long endTime = System.nanoTime();
        System.out.println("Time taken with + operator: " + (endTime - startTime) + " ns");
    }
}
