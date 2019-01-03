package com.ServiceImpl;

import com.DAO.IUserDao;
import com.DaoFatory.DaoFactory;
import com.DatebaseConnection.DatebaseConnection;
import com.Service.IUserService;
import com.VO.UserVO;

import java.util.List;

public class IUserServiceImpl implements IUserService {

    private DatebaseConnection connection = new DatebaseConnection();

    @Override
    public List<UserVO> queryAll() {

        try{
            return DaoFactory.getInstance(IUserDao.class).queryAll(this.connection.getConnection());
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
