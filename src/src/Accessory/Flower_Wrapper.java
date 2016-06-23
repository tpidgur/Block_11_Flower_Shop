package Accessory;

import Herb.Colour;

/**
 * defines the properties of the flower wrapper accessory and calculates its price
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 23.06.2016)
 */
public class Flower_Wrapper extends Accessory {
    /**
     * the enum Colour
     */
    private Colour colour;
    /**
     * length of flower wrapper
     */
    private double length;
    /**
     * the enum Wrapper_Material
     */
    private Wrapper_Material material;
    private double price;

    public Flower_Wrapper(Colour colour, double length, Wrapper_Material material) {
        this.colour = colour;
        this.length = length;
        this.material = material;
    }

    /**
     * calculates price as the multiplication of the wrapper_length per price of 1 meter
     * @return double price of flower_wrapper
     */
    @Override
    public double calcPrice() {
        price = length * material.getPrice();
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower_Wrapper wrapper = (Flower_Wrapper) o;

        if (Double.compare(wrapper.length, length) != 0) return false;
        if (Double.compare(wrapper.price, price) != 0) return false;
        if (colour != wrapper.colour) return false;
        return material == wrapper.material;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = colour != null ? colour.hashCode() : 0;
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (material != null ? material.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "\nFlower_Wrapper{" +
                "colour=" + colour +
                ", length=" + length +
                ", material=" + material +
                ", price=" + price +
                '}';
    }
}
