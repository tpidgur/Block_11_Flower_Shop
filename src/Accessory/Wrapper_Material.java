package Accessory;

/**
 * Created by Зая on 22.06.2016.
 */
public enum Wrapper_Material {PAPER(20), ORGANZA(30), BUCKRAM(10);//price per meter
private double price;

    Wrapper_Material(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
