package cn.sherlock.Inherit_Abstract;

public class Auto {
    private String brand;
    private int length;
    private double price;

    public Auto() {
    }

    public Auto(String brand, int length, double price) {
        this.brand = brand;
        this.length = length;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
