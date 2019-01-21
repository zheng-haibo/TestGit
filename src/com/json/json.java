package com.json;

import net.sf.json.JSONObject;

public class json {

   public static void main(String args[]){
       JSONObject jsonObject = new JSONObject();
       jsonObject.put("1","A");
       jsonObject.put(2,"B");
       System.out.println(jsonObject.toString());
   }
}
