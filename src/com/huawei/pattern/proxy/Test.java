package com.huawei.pattern.proxy;

public class Test {

    public static void main(String[] args) {
        BigStart bigStart = new BigStart("鸡哥");
        Star createproxy = ProxyUtil.createproxy(bigStart);
        String sing = createproxy.sing("只因你太美");
        System.out.println(sing);
        createproxy.dance();
    }
}
