package decorator;

// 装饰器模式
public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}

interface Pizza{

    double getCost();

    String getDescription();
}

class PlainPizza implements Pizza{

    @Override
    public double getCost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "薄饼";
    }
}

abstract class ToppingDecorator implements Pizza{
    // 装饰器
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public double getCost() {
        return pizza.getCost();
    }

    public String getDescription() {
        return pizza.getDescription();
    }
}

class Cheese extends ToppingDecorator{

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public double getCost() {
        return pizza.getCost() + 0.5;
    }

    public String getDescription() {
        return pizza.getDescription() + ",耐闹";
    }
}
