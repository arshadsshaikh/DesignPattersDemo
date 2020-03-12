package builderpattern;

class  CocaBuilder{

        private String drinkType;
        String bottleType;
        String drinkCapacity;
        private boolean isBottleWashed;
        private boolean isBottlePacked;

        public CocaBuilder setDrinkType(String drinkType) {
            this.drinkType = drinkType;
            return  this;
        }

        public CocaBuilder setBottleType(String bottleType) {
            this.bottleType = bottleType;
            return this;
        }

        public CocaBuilder setDrinkCapacity(String drinkCapacity) {
            this.drinkCapacity = drinkCapacity;
            return this;
        }

        public CocaBuilder setBottleWashed(boolean bottleWashed) {
            isBottleWashed = bottleWashed;
            return this;
        }

        public CocaBuilder setBottlePacked(boolean bottlePacked) {
            isBottlePacked = bottlePacked;
            return this;
        }

         public  CocaFactory build(){

            return  new CocaFactory(drinkType,bottleType,drinkCapacity,isBottleWashed,isBottlePacked);

         }


    }