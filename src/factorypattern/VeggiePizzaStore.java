package factorypattern;

public class VeggiePizzaStore extends PizzaStore {
    @Override
   public Pizza createPizza(String type) {

        if(type.equals("cheese")){


            return  new CheesePizza();
        }
        if(type.equals("NZStyle")){


            return  new NZStylePizza();
        }
        return null;
    }
}
