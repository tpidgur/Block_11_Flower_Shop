package Bouquet;

import Accessory.Wrapper_Material;
import Herb.*;

/**
 * Created by Зая on 22.06.2016.
 */
public class Main2 {
    public static void main(String[] args) {
        Bouquet_Builder builder=new Bouquet_Builder();
        builder.fillWithFlowers(10, FlowerType.ROSE, Flower_Role.MAIN_FLOWER, StalkLength.LONG, Fuzziness.ONE_FLOWER, Colour.RED,1);
        builder.fillWithPlants(5,NotFlower.BRANCH,1);
        builder.addFlowerRibbon(Colour.YELLOW,1);
        builder.addFlowerWrapper(Colour.VIOLET,0.3, Wrapper_Material.ORGANZA);

        Bouquet bouquet1=builder.buildBouquetCategory(BouquetCategory.CELEBRATORY).build();
        System.out.println(bouquet1);
    }
}
