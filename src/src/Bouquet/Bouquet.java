package Bouquet;

import Herb.Herb;
import Accessory.*;

import java.util.LinkedList;
import java.util.List;

/**
 * defines the properties of the Bouquet  and calculates its price
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 23.06.2016)
 */
public class Bouquet {
    /**
     * the enum BouquetPriceRange
     */
    private BouquetPriceRange bouquet_type;
    /**
     * the enum BouquetCategory
     */
    private BouquetCategory bouquetCategory;
    /**
     * the enum BouquetSize
     */
    private BouquetSize bouquetSize;
    /**
     * List of accessories
     */
    private List<Accessory> accessoryTypes = new LinkedList<>();
    /**
     * List of herbs, i.e. flowers and plants
     */
    private List<? extends Herb> herbs = new LinkedList<>();
    private double price;

    public BouquetPriceRange getBouquet_type() {
        return bouquet_type;
    }

    /**
     * sets {@code bouquet_type} according to the price range of the bouquet
     */
    public void setBouquet_type() {
        if (price <= 100) {
            bouquet_type = BouquetPriceRange.CHEAP;
        } else if (price > 100 && price < 300) {
            bouquet_type = BouquetPriceRange.BUDGET_FRIENDLY;
        } else if (price >= 300 && price < 1000) {
            bouquet_type = BouquetPriceRange.EXPENSIVE;
        } else {//>=1000
            bouquet_type = BouquetPriceRange.VIP;
        }
    }

    public BouquetCategory getBouquetCategory() {
        return bouquetCategory;
    }

    public void setBouquetCategory(BouquetCategory bouquetCategory) {
        this.bouquetCategory = bouquetCategory;
    }

    public BouquetSize getBouquetSize() {
        return bouquetSize;
    }

    public void setBouquetSize(BouquetSize bouquetSize) {
        this.bouquetSize = bouquetSize;
    }


    public List<Accessory> getAccessoryTypes() {
        return accessoryTypes;
    }

    public void setAccessoryTypes(List<Accessory> accessoryTypes) {
        this.accessoryTypes = accessoryTypes;
    }

    public List<? extends Herb> getHerbs() {
        return herbs;
    }

    public void setHerbs(List<? extends Herb> herbs) {
        this.herbs = herbs;
    }

    @Override
    public String toString() {
        setBouquet_type();
        return "Bouquet{" +
                "bouquet_type=" + bouquet_type +
                ", bouquetCategory=" + bouquetCategory +
                ", bouquetSize=" + bouquetSize +
                ", accessoryTypes=" + accessoryTypes +
                ", herbs=" + herbs +
                ", \nTOTAL price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
