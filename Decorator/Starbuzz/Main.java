package Decorator.Starbuzz;

public class Main{
    public static void main(String[] args){
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage1=new Decaf();
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}