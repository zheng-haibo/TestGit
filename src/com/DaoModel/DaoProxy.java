package com.DaoModel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DaoProxy implements InvocationHandler{


    private Object object; //真实主题

    public void setObject(Object object) {
        this.object = object;
    }

    public Object bind(Object object){

        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {





        return null;
    }

}
