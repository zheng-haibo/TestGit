package com.DaoModel.ServiceImpl;

import com.DaoModel.DAO.IUserDao;
import com.DaoModel.DaoFatory.DaoFactory;
import com.DatebaseConnection.DatebaseConnection;
import com.DaoModel.Service.IUserService;
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
