package com.ssm.asyn.service;

import com.ssm.asyn.mapper.AdminMapper;
import com.ssm.asyn.pojo.Admin;
import com.ssm.asyn.pojo.ReturnResult;
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
    public ReturnResult fetchAdmins() {
        try{
            List<Admin> admins = adminMapper.fetchAdmins();
            return new ReturnResult(true,"fetch successfully", admins);
        }catch (Exception e){
            return new ReturnResult(true, "fail to fetch");
        }
    }

    @Override
    public ReturnResult insertAdmin(Admin admin) {
        try {
            adminMapper.insertAdmin(admin);
            return new ReturnResult(true, "insert successfully");
        }catch (Exception e){
            return new ReturnResult(false, "fail to insert");
        }
    }

    @Override
    public ReturnResult deleteAdminByID(Integer id) {
        try {
            adminMapper.deleteAdminByID(id);
            return new ReturnResult(true, "delete successfully");
        }catch (Exception e){
            return new ReturnResult(false, "fail to delete");
        }
    }

    @Override
    public ReturnResult fetchAdminByID(Integer id) {
        try {
            List<Admin> admins = adminMapper.fetchAdminByID(id);
            if (admins.size()>0){
                Admin admin = admins.get(0);
                return new ReturnResult(true, "fetch successfully", admin);
            }else {
                return new ReturnResult(false,"no result found");
            }
        }catch (Exception e){
            return new ReturnResult(false,"fail to fetch");
        }
    }

    @Override
    public ReturnResult updateAdmin(Admin admin) {
        try {
            adminMapper.updateAdmin(admin);
            return new ReturnResult(true, "update successfully");
        }catch (Exception e){
            e.printStackTrace();
            return new ReturnResult(false, "fail to update");
        }
    }
}
