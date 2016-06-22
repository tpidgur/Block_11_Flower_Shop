package Herb;

/**
 * Created by Зая on 21.06.2016.
 */
public enum FlowerType {
    ROSE(50, 1), TULIP(30, 1), LILLY_OF_THE_VALLEY(5, 1), CHAMOMILE(20, 3), FORGET_ME_NOT(5, 1), PEONY(15, 5), ORCHID(40, 2), CARNATION(15, 3);//додати конструктор для максимальної свіжості
    private int price;
    private int freshDays;

    FlowerType(int price, int freshDays) {
        this.price = price;
        this.freshDays = freshDays;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFreshDays() {
        return freshDays;
    }

    public void setFreshDays(int freshDays) {
        this.freshDays = freshDays;
    }
}
