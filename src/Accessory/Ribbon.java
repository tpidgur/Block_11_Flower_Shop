package Accessory;

import Herb.Colour;

/**
 * Created by Зая on 22.06.2016.
 */
public class Ribbon extends Accessory{
  private   Colour colour;
    private double length;
    private double price;
    private  static final double pricePerMeter=10;

    public Ribbon(Colour colour, double length) {
        this.colour = colour;
        this.length =length;
    }

    @Override
    public String toString() {
        return "\nRibbon{" +
                "colour=" + colour +
                ", length=" + length +
                ", price=" + price +
                '}';
    }

    @Override
    public double calcPrice() {
        price=pricePerMeter*length;
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
}
