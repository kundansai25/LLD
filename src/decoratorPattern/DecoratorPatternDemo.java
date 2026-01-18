package decoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args){
        BasePizza pizza1 = new FarmhousePizza();
        System.out.println(pizza1.cost());
        BasePizza pizza2 = new ExtraCheese(new FarmhousePizza());
        System.out.println(pizza2.cost());
        BasePizza pizza3 = new ExtraVeggies(new ExtraCheese(new FarmhousePizza()));
        System.out.println(pizza3.cost());
    }
}
