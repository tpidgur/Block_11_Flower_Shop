package Bouquet;

import Herb.*;
import Accessory.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Зая on 22.06.2016.
 */
public class Bouquet_Builder {
    private BouquetPriceRange bouquet_type = BouquetPriceRange.CHEAP;
    private BouquetCategory bouquetCategory = BouquetCategory.ALL;
    private BouquetSize bouquetSize = BouquetSize.INSIGNIFICANT;
    private double price;
    private List<Accessory> accessories = new LinkedList<>();
    private List<Herb> herbs = new LinkedList<>();

    Bouquet_Builder buildBouquetCategory(BouquetCategory bouquetCategory) {
        this.bouquetCategory = bouquetCategory;
        return this;
    }


    Bouquet_Builder buildAccessoryTypeList(List accessoryTypes) {
        this.accessories = accessoryTypes;
        return this;
    }

    Bouquet build() {
        Bouquet bouquet = new Bouquet();
        bouquet.setBouquetCategory(bouquetCategory);
        bouquet.setBouquetSize(bouquetSize);
        bouquet.setAccessoryTypes(accessories);
        bouquet.setHerbs(herbs);
        bouquet.setPrice(price);
        return bouquet;
    }

    public void fillWithFlowers(int number, FlowerType flowerType, Flower_Role role, StalkLength length,
                                Fuzziness fuzziness, Colour colour, int currentDay) {
        Flower flower=null;
        for (int i = 0; i < number; i++) {
            flower = new Flower();
            flower.setLength(length);
            flower.setCurrentDay(currentDay);
            flower.setFuzziness(fuzziness);
            flower.setColour(colour);
            flower.setFlowerType(flowerType);
            flower.setFlower_role(role);
            flower.calculatePrice();
            herbs.add(flower);
        }
        price+= flower.getPrice()*number;
    }
    public void fillWithPlants(int number,NotFlower type,int currentDay){
        Plant plant=null;
        for (int i = 0; i < number; i++) {
            plant=new Plant(type) ;
            plant.setCurrentDay(currentDay);
            herbs.add(plant);

        }
        price+=plant.getPrice()*number;
    }
    public void addFlowerBacking(int number, FlowerBackingType type) {
        Flower_Backing backing=null;
        for (int i = 0; i < number; i++) {
            accessories.add(backing=new Flower_Backing(type));
        }
        price+=backing.calcPrice()*number;
    }

    public void addFlowerBasket(Shape shape, Basket_Size size, Colour colour) {
        Flower_Basket basket=null;
        accessories.add(new Flower_Basket(shape, size, colour));
        bouquetSize = BouquetSize.valueOf(size.toString());
        price+= basket.calcPrice();

    }

    public void addFlowerWrapper(Colour colour, double length, Wrapper_Material material) {
        Flower_Wrapper wrapper=null;
        accessories.add(wrapper=new Flower_Wrapper(colour, length, material));
        price+=wrapper.calcPrice();
    }

    public void addFlowerRibbon(Colour colour, double width) {
        Ribbon ribbon=null;
        accessories.add(ribbon=new Ribbon(colour, width));
        price+=ribbon.calcPrice();
    }
}
