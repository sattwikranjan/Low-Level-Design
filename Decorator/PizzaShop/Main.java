package Decorator.PizzaShop;

public class Main{
    public static void main(String[] args){
        BasePizza pizza1=new Farmhouse();
        System.out.println(" $" + pizza1.cost());
        pizza1=new ExtraCheese(pizza1);
        pizza1=new Mushroom(pizza1);
        System.out.println(" $" + pizza1.cost());
    }
}