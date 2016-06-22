package Accessory;

import Herb.Colour;

/**
 * Created by Зая on 22.06.2016.
 */
public class Flower_Wrapper extends Accessory{
    private Colour colour;
    private double length;
    private Wrapper_Material material;
    private double price;

    public Flower_Wrapper(Colour colour, double length,Wrapper_Material material) {
        this.colour = colour;
        this.length = length;
        this.material = material;
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

    @Override
    public double calcPrice() {
        price=length*material.getPrice();
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
}
