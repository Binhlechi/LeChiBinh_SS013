package BT_01_Gioi;

import java.util.ArrayList;

public class InvoiceManager implements Manage<Invoice> {

    private ArrayList<Invoice> invoices = new ArrayList<>();

    @Override
    public void add(Invoice item) {
        invoices.add(item);
        System.out.println("Đã thêm hóa đơn thành công.");
    }

    @Override
    public void update(int index, Invoice item) {
        if (index < 0 || index >= invoices.size()) {
            System.out.println("Vị trí không hợp lệ 😵");
            return;
        }
        invoices.set(index, item);
        System.out.println("Cập nhật hóa đơn thành công.");
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= invoices.size()) {
            System.out.println("Vị trí không hợp lệ 😵");
            return;
        }
        invoices.remove(index);
        System.out.println("Xóa hóa đơn thành công.");
    }

    @Override
    public void display() {
        if (invoices.isEmpty()) {
            System.out.println("Danh sách hóa đơn trống.");
            return;
        }

        System.out.println("\nDanh sách hóa đơn:");
        for (int i = 0; i < invoices.size(); i++) {
            System.out.println((i + 1) + ". " + invoices.get(i));
        }
    }
}

