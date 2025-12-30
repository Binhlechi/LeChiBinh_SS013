package BT_01_Kha;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Person> users = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do{
            showMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    showUser();
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.err.println("Vui lòng chọn lại");
            }
        } while (choice != 4);
    }
    static void showMenu() {
        System.out.println("\n************** MENU QUẢN LÝ NGƯỜI DÙNG **************");
        System.out.println("1. Thêm người dùng");
        System.out.println("2. Xóa người dùng");
        System.out.println("3. Hiển thị danh sách người dùng");
        System.out.println("4. Thoát");
        System.out.print("Lựa chọn của bạn: ");
    }
    static void addUser() {
        String name, email, phone;
        do{
            System.out.println("Nhập tên người dùng: ");
            name = sc.nextLine();
            if(name.isEmpty()) {
                System.out.println("Vui lòng không để trống !");
            }
        } while (name.isEmpty());
        do{
            System.out.println("Nhập email người dùng: ");
            email = sc.nextLine();
            if(email.isEmpty()) {
                System.out.println("Vui lòng không để trống !");
            }
        }  while (email.isEmpty());
        do {
            System.out.println("Nhập số điện thoại người dùng: ");
            phone = sc.nextLine();
            if(phone.isEmpty()) {
                System.out.println("Vui lòng không để trống !");
            }
        }  while (phone.isEmpty());
        users.add(new Person(name, email, phone));
        System.out.println("Người dùng đã được thêm thành công");
    }
    static void deleteUser() {
        System.out.println("Nhập email người dùng để xoá: ");
        String email = sc.nextLine();
        boolean found = false;
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getEmail().equals(email)) {
                users.remove(i);
                found = true;
                System.out.println("Người dùng đã được xoá thành công");
                break;
            }
        }
        if(!found) {
            System.out.println("Không tìm thấy người dùng");
        }
    }
    static void showUser() {
        if(users.isEmpty()) {
            System.out.println("Danh sách người dùng trống.");
            return;
        }
        System.out.println("\nDanh sách người dùng: ");
        for(Person p : users) {
            System.out.println(p);
        }
    }
}
