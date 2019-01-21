package com.DaoModel.DAOImpl;

import com.DaoModel.DAO.IUserDao;
import com.VO.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class IUserDaoImpl implements IUserDao {


    @Override
    public List<UserVO> queryAll(Connection connection) {

        List<UserVO> userVoList = new ArrayList<UserVO>();

        try {
            String sql = "select user_id,sex from user";

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                UserVO userVO = new UserVO();
                userVO.setUser_id(rs.getString(1));
                userVO.setSex(rs.getString(2));
                userVoList.add(userVO);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return userVoList;
    }
}
