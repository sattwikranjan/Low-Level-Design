package Decorator.PizzaShop;

public abstract class ToppingsDecorator extends BasePizza{
    BasePizza basePizza;
    public abstract int cost();
}