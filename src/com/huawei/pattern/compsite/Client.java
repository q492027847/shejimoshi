package com.huawei.pattern.compsite;

import java.util.ArrayList;
import java.util.List;

// 组合模式
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
    String name;

    abstract void add(IComponent component);

    abstract void remove(IComponent component);
}

class Composite extends Component{

    List<IComponent> child = new ArrayList<>();

    public Composite(String name){
        this.name = name;
    }

    @Override
    void add(IComponent component) {
        child.add(component);
    }

    @Override
    void remove(IComponent component) {
        child.remove(component);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (IComponent component : child) {
            component.display();
        }
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