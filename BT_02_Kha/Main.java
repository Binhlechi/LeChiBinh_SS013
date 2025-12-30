package BT_02_Kha;
import BT_02_Kha.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();
        int choice;

        do {
            System.out.println("\n************ MENU QUẢN LÝ ĐIỂM DANH ************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String name = sc.nextLine();
                    if (name.isEmpty()) {
                        System.out.println("Tên không được để trống!");
                    } else {
                        manager.add(new Student(name));
                    }
                    break;

                case 2:
                    manager.display();
                    System.out.print("Nhập vị trí sinh viên cần sửa: ");
                    int updateIndex = Integer.parseInt(sc.nextLine()) - 1;
                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();
                    manager.update(updateIndex, new Student(newName));
                    break;

                case 3:
                    manager.display();
                    System.out.print("Nhập vị trí sinh viên cần xóa: ");
                    int deleteIndex = Integer.parseInt(sc.nextLine()) - 1;
                    manager.delete(deleteIndex);
                    break;

                case 4:
                    manager.display();
                    break;

                case 5:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Chọn sai rồi ku ");
            }

        } while (choice != 5);
    }
}
