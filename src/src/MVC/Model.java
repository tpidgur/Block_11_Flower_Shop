package MVC;


import Accessory.Wrapper_Material;
import Bouquet.*;
import Herb.*;

/**
 * creates one rose bouquet
 * @author Pidhurska Tetiana
 * @version 1 (created on 22.06.2016)
 */
public class Model {
    /**
     * instance of Bouquet_Builder class
     */
    Bouquet_Builder builder = new Bouquet_Builder();

    /**
     * builds the roseBouquet with accessories
     */
    public void createRoseBouquet() {
        builder.fillWithPlants(3, NotFlower.BRANCH, 5);
        builder.fillWithFlowers(10, FlowerType.ROSE, Flower_Role.MAIN_FLOWER, StalkLength.LONG, Fuzziness.ONE_FLOWER, Colour.RED, 1);
        builder.addFlowerRibbon(Colour.YELLOW, 1);
        builder.addFlowerWrapper(Colour.VIOLET, 0.3, Wrapper_Material.ORGANZA);
        Bouquet bouquet1 = builder.buildBouquetCategory(BouquetCategory.CELEBRATORY).build();
        System.out.println(bouquet1);
    }
}
