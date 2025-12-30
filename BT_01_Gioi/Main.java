package BT_01_Gioi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InvoiceManager manager = new InvoiceManager();
        int choice;

        do {
            System.out.println("\n************ MENU QUẢN LÝ HÓA ĐƠN ************");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Sửa hóa đơn");
            System.out.println("3. Xóa hóa đơn");
            System.out.println("4. Hiển thị danh sách hóa đơn");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã hóa đơn: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập số tiền: ");
                    double amount = Double.parseDouble(sc.nextLine());

                    manager.add(new Invoice(id, amount));
                    break;

                case 2:
                    manager.display();
                    System.out.print("Nhập vị trí hóa đơn cần sửa: ");
                    int updateIndex = Integer.parseInt(sc.nextLine()) - 1;

                    System.out.print("Nhập mã hóa đơn mới: ");
                    String newId = sc.nextLine();

                    System.out.print("Nhập số tiền mới: ");
                    double newAmount = Double.parseDouble(sc.nextLine());

                    manager.update(updateIndex, new Invoice(newId, newAmount));
                    break;

                case 3:
                    manager.display();
                    System.out.print("Nhập vị trí hóa đơn cần xóa: ");
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

