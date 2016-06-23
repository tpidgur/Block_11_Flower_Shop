package Bouquet;

import Herb.*;
import Accessory.*;

import java.util.LinkedList;
import java.util.List;

/**
 * the Builder pattern realization that builds the bouquet
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 23.06.2016)
 */
public class Bouquet_Builder {
    /**
     * initial price category of bouquet
     */
    private BouquetPriceRange bouquet_type = BouquetPriceRange.CHEAP;
    /**
     * initial bouquet category depending on the event's type
     */
    private BouquetCategory bouquetCategory = BouquetCategory.ALL;
    /**
     * initial bouquet size category
     */
    private BouquetSize bouquetSize = BouquetSize.INSIGNIFICANT;
    private double price;
    /**
     * list of accessories
     */
    private List<Accessory> accessories = new LinkedList<>();
    /**
     * list of herbs that include both flowers and plants
     */
    private List<Herb> herbs = new LinkedList<>();

    /**
     * sets the {@code bouquetCategory}
     *
     * @param bouquetCategory
     * @return itself ( Bouquet_Builder instance)
     */
   public Bouquet_Builder buildBouquetCategory(BouquetCategory bouquetCategory) {
        this.bouquetCategory = bouquetCategory;
        return this;
    }

    /**
     * sets the list of accessories
     *
     * @param accessoryTypes
     * @return itself ( Bouquet_Builder instance)
     */
   public Bouquet_Builder buildAccessoryTypeList(List accessoryTypes) {
        this.accessories = accessoryTypes;
        return this;
    }


    /**
     * adds the {@code number} of newly created Flowers to the {@code herbs} collection
     * and sums its added price with the total one
     *
     * @param number
     * @param flowerType
     * @param role
     * @param length
     * @param fuzziness
     * @param colour
     * @param currentDay
     */
    public void fillWithFlowers(int number, FlowerType flowerType, Flower_Role role, StalkLength length,
                                Fuzziness fuzziness, Colour colour, int currentDay) {
        Flower flower = null;
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
        price += flower.getPrice() * number;
    }

    /**
     * adds the {@code number} of newly created Plants to the {@code herbs} collection
     * and sums its added price with the total one
     *
     * @param number
     * @param type
     * @param currentDay
     */
    public void fillWithPlants(int number, NotFlower type, int currentDay) {
        Plant plant = null;
        for (int i = 0; i < number; i++) {
            plant = new Plant(type);
            plant.setCurrentDay(currentDay);
            plant.calculatePrice();
            herbs.add(plant);
        }
        price += plant.getPrice() * number;
    }

    /**
     * adds the {@code number} of newly created Flower_Backing to the {@code accessories} collection
     * and sums its added price with the total one
     *
     * @param number
     * @param type
     */
    public void addFlowerBacking(int number, FlowerBackingType type) {
        Flower_Backing backing = null;
        for (int i = 0; i < number; i++) {
            accessories.add(backing = new Flower_Backing(type));
        }
        price += backing.calcPrice() * number;
    }

    /**
     * adds the newly created Flower_Basket to the {@code accessories} collection
     * and sums its added price with the total one
     *
     * @param shape
     * @param size
     * @param colour
     */
    public void addFlowerBasket(Shape shape, Basket_Size size, Colour colour) {
        Flower_Basket basket = null;
        accessories.add(new Flower_Basket(shape, size, colour));
        bouquetSize = BouquetSize.valueOf(size.toString());
        price += basket.calcPrice();

    }

    /**
     * adds the newly created Flower_Wrapper to the {@code accessories} collection
     * and sums its added price with the total one
     *
     * @param colour
     * @param length
     * @param material
     */
    public void addFlowerWrapper(Colour colour, double length, Wrapper_Material material) {
        Flower_Wrapper wrapper = null;
        accessories.add(wrapper = new Flower_Wrapper(colour, length, material));
        price += wrapper.calcPrice();
    }

    /**
     * adds the newly created Ribbon to the {@code accessories} collection
     * and sums its added price with the total one
     *
     * @param colour
     * @param width
     */
    public void addFlowerRibbon(Colour colour, double width) {
        Ribbon ribbon = null;
        accessories.add(ribbon = new Ribbon(colour, width));
        price += ribbon.calcPrice();
    }

    /**
     * builds the bouquet
     *
     * @return Bouquet object that has all the fields corresponding to the fields of  Bouquet_Builder class
     */
   public Bouquet build() {
        Bouquet bouquet = new Bouquet();
        bouquet.setBouquetCategory(bouquetCategory);
        bouquet.setBouquetSize(bouquetSize);
        bouquet.setAccessoryTypes(accessories);
        bouquet.setHerbs(herbs);
        bouquet.setPrice(price);
        return bouquet;
    }
}
