package com.imooc.service.impl;


import com.BaseTest;
import com.imooc.pojo.SysUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: ruoan
 * Date: 2020/11/29 11:52 下午
 * @Description:
 */
public class UserServiceImplTest extends BaseTest {

    @Autowired
    private UserServiceImpl service;

    @Test
    public void saveUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void queryUserById() {
    }

    @Test
    public void queryUserList() {
    }

    @Test
    public void queryUserListPaged() {
    }

    @Test
    public void queryUserByIdCustom() {
    }

    @Test
    public void saveUserTransactional() {
    }

    @Test
    public void queryAll() {
        List<SysUser> sysUsers = service.queryAll();
        System.out.println(sysUsers);
    }
}