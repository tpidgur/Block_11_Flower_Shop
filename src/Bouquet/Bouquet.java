package Bouquet;

import Herb.Herb;
import Accessory.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Зая on 21.06.2016.
 */
public class Bouquet {
  private BouquetPriceRange bouquet_type;
    private BouquetCategory bouquetCategory;
    private BouquetSize bouquetSize;

    private List<Accessory> accessoryTypes=new LinkedList<>();
    private List<? extends Herb> herbs=new LinkedList<>();
    private double price;

    public BouquetPriceRange getBouquet_type() {
        return bouquet_type;
    }

    public void setBouquet_type() {
        if (price<=100){
            bouquet_type=BouquetPriceRange.CHEAP;
        }else if (price>100 && price<300){
         bouquet_type=BouquetPriceRange.BUDGET_FRIENDLY;}
        else if (price>=300 && price<1000){
            bouquet_type=BouquetPriceRange.EXPENSIVE;}
        else  {//>=1000
            bouquet_type=BouquetPriceRange.VIP;}
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
