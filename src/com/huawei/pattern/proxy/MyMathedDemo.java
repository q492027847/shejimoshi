package com.huawei.pattern.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyMathedDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.huawei.pattern.proxy.Student");

        // 获取所有公开的方法（包括父类）
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("---------------------------------------------------");
            System.out.println(declaredMethod);
        }

        Method m = clazz.getMethod("eat",String.class);
        System.out.println(m);


        // 获取形参列表
        Class<?>[] parameterTypes = m.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }

        // 获取修饰符
        int modifiers = m.getModifiers();
        System.out.println(modifiers);

        // 获取方法名
        String name = m.getName();
        System.out.println(name);

        // 调用方法
        Student s = new Student();
        String invoke = (String) m.invoke(s, "汉堡包");
        System.out.println(invoke);


    }
}
