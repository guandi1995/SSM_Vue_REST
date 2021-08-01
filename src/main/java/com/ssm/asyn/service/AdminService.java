package com.ssm.asyn.service;

import com.ssm.asyn.pojo.Admin;
import com.ssm.asyn.pojo.ReturnResult;

import java.util.List;
import java.util.Map;

public interface AdminService {
    ReturnResult fetchAdmins();
    ReturnResult insertAdmin(Admin admin);
    ReturnResult deleteAdminByID(Integer id);
    ReturnResult fetchAdminByID(Integer id);
    ReturnResult updateAdmin(Admin admin);
}
