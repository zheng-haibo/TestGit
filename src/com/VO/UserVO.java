package com.VO;

import java.io.Serializable;

public class UserVO implements Serializable{


    private static final long serializableUID = 1l;

    private String user_id;
    private String sex;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
