package builderpattern;

public class CocaShopDemo {

    public static void main(String[] args) {

        CocaFactory cocaBuilder= new CocaBuilder().setDrinkType("Soft").build();

        System.out.println("drinktype is "+cocaBuilder.drinkType);

    }
}
