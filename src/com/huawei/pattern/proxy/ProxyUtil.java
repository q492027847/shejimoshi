package com.huawei.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil{
    public static Star createproxy(BigStart bigStart){
        return (Star)Proxy.newProxyInstance(bigStart.getClass().getClassLoader(),
                new Class[]{Star.class},
                (proxy, method, args) -> {
                    if ("sing".equals(method.getName())){
                        System.out.println("准备话筒，收钱");
                    }else if ("dance".equals(method.getName())){
                        System.out.println("准备场地，收钱");
                    }
                    return method.invoke(bigStart,args);
                }
        );
    }
}
