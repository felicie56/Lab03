package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        // Tạo hai đối tượng DigitalVideoDisc
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        System.out.println("Before swapping:");
        System.out.println("jungleDVD title: " + jungleDVD.getTitle());
        System.out.println("cinderellaDVD title: " + cinderellaDVD.getTitle());

        // Dùng mảng để chứa các đối tượng cần đổi chỗ
        DigitalVideoDisc[] dvds = {jungleDVD, cinderellaDVD};

        // Gọi phương thức swap
        swap(dvds);

        System.out.println("\nAfter swapping:");
        System.out.println("jungleDVD title: " + dvds[0].getTitle());
        System.out.println("cinderellaDVD title: " + dvds[1].getTitle());

        // Thay đổi tiêu đề của jungleDVD
        changeTitle(dvds[0], dvds[1].getTitle());

        System.out.println("\nAfter changing title:");
        System.out.println("jungleDVD title: " + dvds[0].getTitle());
    }

    // Phương thức swap để đổi chỗ hai đối tượng trong mảng
    public static void swap(DigitalVideoDisc[] dvds) {
        if (dvds.length == 2) {
            DigitalVideoDisc temp = dvds[0];
            dvds[0] = dvds[1];
            dvds[1] = temp;
        }
    }

    // Phương thức thay đổi tiêu đề của đối tượng
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }
}
