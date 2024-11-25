package hust.soict.dsai.aims; // Package chính của bài tập

import hust.soict.dsai.aims.cart.Cart; // Import lớp Cart
import hust.soict.dsai.aims.disc.DigitalVideoDisc; // Import lớp DigitalVideoDisc

public class Aims {
    public static void main(String[] args) {
        // Tạo đối tượng giỏ hàng
        Cart cart = new Cart();

        // Tạo một số DVD và thêm vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Zero Length DVD", "Experiment", "Unknown", 0, 5.99f); // DVD không có nội dung
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladdin");

        // Hiển thị thông tin từng DVD
        System.out.println(dvd1.toString());
        System.out.println(dvd2.toString());
        System.out.println(dvd3.toString());
        System.out.println(dvd4.toString());
        System.out.println(dvd5.toString());
        

        // Thêm các DVD vào giỏ hàng
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2, dvd3);
        cart.addDigitalVideoDisc(dvd4, dvd5);

        // Hiển thị giỏ hàng
        System.out.println("\nGiỏ hàng:");
        cart.print();

        // Tính và hiển thị tổng chi phí
        System.out.println("\nTổng chi phí: $" + cart.totalCost());

        // Tìm kiếm DVD theo ID
        System.out.println("\nTìm kiếm DVD theo ID:");
        cart.searchById(2); // Tìm thấy
        cart.searchById(10); // Không tìm thấy

        // Tìm kiếm DVD theo tiêu đề
        System.out.println("\nTìm kiếm DVD theo tiêu đề:");
        cart.searchByTitle("Aladdin"); // Tìm thấy
        cart.searchByTitle("Frozen");  // Không tìm thấy

        // Xóa một DVD khỏi giỏ hàng
        System.out.println("\nXóa DVD khỏi giỏ hàng:");
        cart.removeDigitalVideoDisc(dvd2); // Xóa DVD "Star Wars"
        cart.print();

        // Hiển thị giỏ hàng đã sắp xếp theo tiêu đề
        System.out.println("\nSắp xếp giỏ hàng theo tiêu đề:");
        cart.sortByTitle();
        cart.print();

        // Hiển thị giỏ hàng đã sắp xếp theo giá
       System.out.println("\nSắp xếp giỏ hàng theo giá:");
        cart.sortByCost();
        cart.print();
    }
}
