package compsite;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component component1 = new Composite("component1");
        Component component2 = new Composite("component2");
        IComponent left1 = new Left("left1");
        IComponent left2 = new Left("left2");
        IComponent left3 = new Left("left3");
        root.add(component1);
        root.add(component2);
        component1.add(left1);
        component2.add(left2);
        component2.add(left3);
        root.display();
    }
}

interface IComponent{
    void display();
}

abstract class Component implements IComponent{
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(IComponent component);

    public abstract void remove(IComponent component);
}

class Composite extends Component{

    private List<IComponent> children = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (IComponent child : children) {
            child.display();
        }

    }

    @Override
    public void add(IComponent component) {
        children.add(component);
    }

    @Override
    public void remove(IComponent component) {
        children.remove(component);
    }
}


class Left implements IComponent{
    String name;

    public Left(String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}