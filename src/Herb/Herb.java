package Herb;

/**
 * Created by Зая on 21.06.2016.
 */
public abstract class Herb {
    private Colour colour;//можливо перенести в flower??
    private StalkLength length;
    private Freshness fresh;

    private int currentDay;
    private double price;


    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public StalkLength getLength() {
        return length;
    }

    public void setLength(StalkLength length) {
        this.length = length;
    }

    public Freshness getFresh() {
        return fresh;
    }

    public void setFresh(Freshness fresh) {
        this.fresh = fresh;
    }

//    @Override
//    public String toString() {
//        return "\n"+colour +
//                ", " + length +
//                ", " + fresh;
//    }

    @Override
    public String toString() {
        return  "colour=" + colour +
                ", length=" + length +
                ", fresh=" + fresh +
                ", currentDay=" + currentDay +
                ", price=" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herb herb = (Herb) o;
        //if (freshnessDayLimit != herb.freshnessDayLimit) return false;
        if (currentDay != herb.currentDay) return false;
        if (getColour() != herb.getColour()) return false;
        if (getLength() != herb.getLength()) return false;
        if (getPrice() != herb.getPrice()) return false;
        return getFresh() == herb.getFresh();

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getColour() != null ? getColour().hashCode() : 0;
        result = 31 * result + (getLength() != null ? getLength().hashCode() : 0);
        result = 31 * result + (getFresh() != null ? getFresh().hashCode() : 0);
        result = 31 * result + getCurrentDay();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }
}
