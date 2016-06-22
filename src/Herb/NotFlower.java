package Herb;

/**
 * Created by Зая on 21.06.2016.
 */
public enum NotFlower {
    BRANCH(10),BUSH(20);
    private double price;

    NotFlower(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
