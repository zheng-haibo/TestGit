package com.DaoFatory;

public class DaoFactory {

    public static <T>T getInstance(Class<T> cls){
        try {
            return cls.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
