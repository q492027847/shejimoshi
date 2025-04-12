package com.huawei.pattern.proxy;

public class Student {

    private String name;

    private int age;

    public String eat(String foodName){
        System.out.println("真正吃" + foodName);
        return "奥利给";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
