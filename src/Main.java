import Herb.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Зая on 21.06.2016.
 */
public class Main {
  static   List flowers = new LinkedList<>();
    public static void main(String[] args) {
        flowersDelivery(10,FlowerType.ROSE,StalkLength.LONG,Fuzziness.ONE_FLOWER,Colour.RED,5);
        System.out.println(flowers);


    }
    public static List flowersDelivery(int flowersNumber, FlowerType flowerType, StalkLength length,
                                 Fuzziness fuzziness, Colour colour,  int currentDay ) {
        for (int i = 0; i < flowersNumber; i++) {
            Flower flower=new Flower();
            flower.setLength(length);
            flower.setCurrentDay(currentDay);
            flower.setFuzziness(fuzziness);
            flower.setColour(colour);
            flower.setFlowerType(flowerType);
          flower.calculatePrice();
            flowers.add(flower);
        }
        return flowers;
    }
}
