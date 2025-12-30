package BT_02_Gioi;

public class Order {
    private String orderId;
    private String customerName;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Mã đơn hàng: " + orderId + ", Tên khách hàng: " + customerName;
    }
}

