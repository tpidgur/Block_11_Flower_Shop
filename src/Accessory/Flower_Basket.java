package Accessory;


import Herb.Colour;

import javax.naming.ldap.PagedResultsControl;

/**
 * Created by Зая on 22.06.2016.
 */
public class Flower_Basket extends Accessory {
    private Shape shape;
    private Basket_Size size;
//    private boolean isWithHandle = true;
//    private double baseHeight;
//    private double totalHeight;//base+handle
    private Colour colour;
    private double price;

    public Flower_Basket(Shape shape, Basket_Size size,  Colour colour) {
        this.shape = shape;
        this.size = size;
//        this.isWithHandle = isWithHandle;
//        this.baseHeight = baseHeight;
//        this.totalHeight = totalHeight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\nFlower_Basket{" +
                "shape=" + shape +
                ", size=" + size +
                ", colour=" + colour +
                ", price=" + price +
                '}';
    }

    @Override
    public double calcPrice() {
        double coefficient = 0;
        if (size == Basket_Size.SMALL) {
            coefficient = 1;
        } else if (size == Basket_Size.MIDDLE) {
            coefficient = 1.5;
        } else if (size == Basket_Size.BIG) {
            coefficient = 2;
        }
        price *= coefficient;
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower_Basket basket = (Flower_Basket) o;

        if (Double.compare(basket.price, price) != 0) return false;
        if (shape != basket.shape) return false;
        if (size != basket.size) return false;
        return colour == basket.colour;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shape != null ? shape.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
