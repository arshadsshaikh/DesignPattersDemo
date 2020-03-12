package builderpattern;

import java.awt.event.ComponentAdapter;

 class CocaFactory {

     String drinkType;
    String bottleType;
    String drinkCapacity;
    private boolean isBottleWashed;
    private boolean isBottlePacked;

    public CocaFactory(String drinkType, String bottleType, String drinkCapacity, boolean isBottleWashed,
                       boolean isBottlePacked){

        this.drinkType=drinkType;
        this.drinkCapacity=drinkCapacity;
        this.bottleType=bottleType;
        this.isBottlePacked=isBottlePacked;
        this.isBottleWashed=isBottleWashed;

    }

}
