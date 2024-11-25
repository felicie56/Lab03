package hust.soict.dsai.garbage;

package hust.soict.dsai.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        long startTime = System.nanoTime();
        
        // Sử dụng StringBuffer để nối chuỗi, tránh việc tạo "rác"
        for (int i = 0; i < 100000; i++) {
            result.append("Some string to add garbage " + i + " ");
        }

        long endTime = System.nanoTime();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ns");
    }
}
