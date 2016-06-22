package Herb;

/**
 * Created by Зая on 21.06.2016.
 */
public class Plant extends Herb {
    private NotFlower type;

    private double price;

    public Plant(NotFlower type) {
        this.type = type;
    }

    public void calculatePrice() {
        price = type.getPrice();
        if (super.getCurrentDay() < 10) {//if the herb is less than 10 days
            super.setFresh(Freshness.NORMAL);
            super.setPrice(price);
        } else {
            super.setFresh(Freshness.OLD);
            super.setPrice(0.1 * price);
        }
    }

    @Override
    public String toString() {
        calculatePrice();
        return "\n" + type + ", " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Plant plant = (Plant) o;

        if (Double.compare(plant.getPrice(), getPrice()) != 0) return false;
        return type == plant.type;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
