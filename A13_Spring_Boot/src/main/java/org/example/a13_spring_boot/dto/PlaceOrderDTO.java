package org.example.a13_spring_boot.dto;

public class PlaceOrderDTO {
    private int id;
    private int qty;
    private double price;
    private int customer_id;
    private int code;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(int id, int qty, double price, int customer_id, int code) {
        this.id = id;
        this.qty = qty;
        this.price = price;
        this.customer_id = customer_id;
        this.code = code;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "PlaceOrderDTO{" +
                "id=" + id +
                ", qty=" + qty +
                ", price=" + price +
                ", customer_id=" + customer_id +
                ", code=" + code +
                '}';
    }
}

