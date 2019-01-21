package com.DaoModel.DAO;

import com.VO.UserVO;

import java.sql.Connection;
import java.util.List;

public interface IUserDao {

        public List<UserVO> queryAll(Connection connection);

}
