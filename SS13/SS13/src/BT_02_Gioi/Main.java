package BT_02_Gioi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager manager = new OrderManager();
        int choice;

        do {
            System.out.println("\n************ MENU QUẢN LÝ ĐƠN HÀNG ************");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh sách đơn hàng");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã đơn hàng: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập tên khách hàng: ");
                    String name = sc.nextLine();

                    manager.add(new Order(id, name));
                    break;

                case 2:
                    manager.display();
                    System.out.print("Nhập vị trí đơn hàng cần sửa: ");
                    int updateIndex = Integer.parseInt(sc.nextLine()) - 1;

                    System.out.print("Nhập mã đơn hàng mới: ");
                    String newId = sc.nextLine();

                    System.out.print("Nhập tên khách hàng mới: ");
                    String newName = sc.nextLine();

                    manager.update(updateIndex, new Order(newId, newName));
                    break;

                case 3:
                    manager.display();
                    System.out.print("Nhập vị trí đơn hàng cần xóa: ");
                    int deleteIndex = Integer.parseInt(sc.nextLine()) - 1;

                    manager.delete(deleteIndex);
                    break;

                case 4:
                    manager.display();
                    break;

                case 5:
                    System.out.println("Thoát chương trình 👋");
                    break;

                default:
                    System.out.println("Chọn sai rồi ku 😤");
            }

        } while (choice != 5);
    }
}

