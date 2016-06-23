package Accessory;

import Herb.Flower;

/**
 * Defines the properties of the flower backing accessory and calculates its price
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 23.06.2016)
 */
public class Flower_Backing extends Accessory {
    /**
     * defines the type of flower backing: CUP OR SUPPORT
     */
    private FlowerBackingType type;
    /**
     * defines the price of flower backing
     */
    private double price;

    public Flower_Backing(FlowerBackingType type) {
        this.type = type;
    }

    /**
     * defines prices depending on the type of flower backing.
     * if it is a support the price is 1.5 times higher than the for the cup
     *
     * @return double price
     */
    @Override
    public double calcPrice() {
        double coefficient = 0;
        if (type == FlowerBackingType.CUP) {
            coefficient = 1;
        } else {
            coefficient = 1.5;
        }
        price *= coefficient;
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower_Backing backing = (Flower_Backing) o;

        if (Double.compare(backing.price, price) != 0) return false;
        return type == backing.type;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "\nFlower_Backing{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
