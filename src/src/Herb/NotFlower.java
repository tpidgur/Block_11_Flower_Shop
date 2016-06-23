package Herb;

/**
 * green options
 * constructor's input param is the price
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 23.06.2016)
 */
public enum NotFlower {
    BRANCH(10), BUSH(20);
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
