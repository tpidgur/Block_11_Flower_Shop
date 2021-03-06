package Herb;

/**
 * Created by Зая on 21.06.2016.
 */
public class Flower extends Herb {
    private Fuzziness fuzziness;
    private FlowerType flowerType;
    private Flower_Role flower_role;
//    public Flower() {
//        calculatePrice();
//    }

    public void calculatePrice() {
        super.getPrice();
        int price = flowerType.getPrice();
        if (super.getCurrentDay() <= flowerType.getFreshDays()) {
            super.setFresh(Freshness.VERY_FRESH);
            super.setPrice(price);
        } else if (super.getCurrentDay() - flowerType.getFreshDays() == 2) {//if more than two days plus days of being very fresh
            super.setFresh(Freshness.NORMAL);
            super.setPrice(0.8 * price);
        } else if (super.getCurrentDay() - flowerType.getFreshDays() == 3) {
            super.setFresh(Freshness.OLD);
            super.setPrice(0.5 * price);
        } else {
            super.setFresh(Freshness.WITHERED);
            super.setPrice(0.1 * price);
        }
    }

    public Fuzziness getFuzziness() {
        return fuzziness;
    }

    public void setFuzziness(Fuzziness fuzziness) {
        this.fuzziness = fuzziness;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

//    @Override
//    public String toString() {
//        return super.toString() + ", " + fuzziness +
//                ", " + flowerType+", " +flower_role+", " +getCurrentDay()+", " + getPrice();
//    }
//

    @Override
    public String toString() {
        return "\n" +
                "FlowerType=" + flowerType +
                ", flower_role=" + flower_role +
                ", fuzziness=" + fuzziness +", "+
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flower flower = (Flower) o;
        if (getFuzziness() != flower.getFuzziness()) return false;
        if (getFlower_role() != flower.getFlower_role()) return false;
        return getFlowerType() == flower.getFlowerType();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getFuzziness() != null ? getFuzziness().hashCode() : 0);
        result = 31 * result + (getFlowerType() != null ? getFlowerType().hashCode() : 0);
        result = 31 * result + (getFlower_role() != null ? getFlower_role().hashCode() : 0);
        return result;
    }

    public Flower_Role getFlower_role() {
        return flower_role;
    }

    public void setFlower_role(Flower_Role flower_role) {
        this.flower_role = flower_role;
    }
}
