package com.ssm.asyn.service;

import com.ssm.asyn.pojo.Admin;

import java.util.List;
import java.util.Map;

public interface AdminService {
    List<Admin> fetchAdmins();
    int insertAdmin(Admin admin);
    int deleteAdminByID(Integer id);
    List<Map> fetchAdminByID(Integer id);
    int updateAdmin(Admin admin);
}
