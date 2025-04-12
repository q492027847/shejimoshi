package com.huawei.pattern.proxy;

public class BigStart implements Star{

    private String name;

    public BigStart(){

    }

    public BigStart(String name){
        this.name = name;
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name + "正在" + name);
        return "谢谢";
    }

    @Override
    public void dance() {
        System.out.println(this.name + "正在跳舞");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
