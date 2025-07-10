package Decorator.PizzaShop;

public class ExtraCheese extends ToppingsDecorator{
    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    public int cost(){
        return 50 + basePizza.cost();
    }
}