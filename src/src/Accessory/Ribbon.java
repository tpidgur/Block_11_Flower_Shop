package Accessory;

import Herb.Colour;

/**
 * defines the properties of the ribbon accessory and calculates its price
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 23.06.2016)
 */
public class Ribbon extends Accessory {
    /**
     * the enum Colour
     */
    private Colour colour;
    private double length;
    private double price;
    /**
     * price per meter
     */
    private static final double pricePerMeter = 10;

    public Ribbon(Colour colour, double length) {
        this.colour = colour;
        this.length = length;
    }

    /**
     * calculates price as result of multiplication of {@code pricePerMeter}  by {@code length}
     *
     * @return double price of ribbon
     */
    @Override
    public double calcPrice() {
        price = pricePerMeter * length;
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ribbon ribbon = (Ribbon) o;
        if (Double.compare(ribbon.length, length) != 0) return false;
        if (Double.compare(ribbon.price, price) != 0) return false;
        return colour == ribbon.colour;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = colour != null ? colour.hashCode() : 0;
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "\nRibbon{" +
                "colour=" + colour +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
