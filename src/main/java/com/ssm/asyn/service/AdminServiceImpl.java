package com.ssm.asyn.service;

import com.ssm.asyn.mapper.AdminMapper;
import com.ssm.asyn.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Di Guan on 7/31/2021 10:34 PM
 */
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> fetchAdmins() {
        return adminMapper.fetchAdmins();
    }

    @Override
    public int insertAdmin(Admin admin) {
        return 0;
    }

    @Override
    public int deleteAdminByID(Integer id) {
        return 0;
    }

    @Override
    public List<Map> fetchAdminByID(Integer id) {
        return null;
    }

    @Override
    public int updateAdmin(Admin admin) {
        return 0;
    }
}
