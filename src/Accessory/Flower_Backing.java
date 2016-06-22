package Accessory;

import Herb.Flower;

/**
 * Created by Зая on 22.06.2016.
 */
public class Flower_Backing extends Accessory {
private FlowerBackingType type;
    private double price;
    public Flower_Backing(FlowerBackingType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nFlower_Backing{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }

    @Override
    public double calcPrice() {
        double coefficient = 0;
        if (type == FlowerBackingType.CUP) {
            coefficient = 1;
        }else {
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
}
