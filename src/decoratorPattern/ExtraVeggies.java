package decoratorPattern;

public class ExtraVeggies extends ToppingsDecorator{
    BasePizza pizza;
    public ExtraVeggies(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost(){
        return this.pizza.cost() +50;
    }
}
