package com.DaoModel.ServiceFatory;

public class ServiceFatory {


    public static <T>T  getServiceinstance(Class<T> cla){

        try{
            return cla.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
