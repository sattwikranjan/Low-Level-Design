package Decorator.PizzaShop;

public class Mushroom extends ToppingsDecorator{
    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    public int cost(){
        return 40 + basePizza.cost();
    }
}