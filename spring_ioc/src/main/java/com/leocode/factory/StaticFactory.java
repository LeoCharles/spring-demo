package com.leocode.factory;

import com.leocode.dao.UserDao;
import com.leocode.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
