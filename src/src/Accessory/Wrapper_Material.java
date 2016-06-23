package Accessory;

/**
 * the wrapper material options of {@code Flower_Wrapper}
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 23.06.2016)
 */
public enum Wrapper_Material {
    /**
     * defines kind of material and price per meter
     */
    PAPER(20), ORGANZA(30), BUCKRAM(10);
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
