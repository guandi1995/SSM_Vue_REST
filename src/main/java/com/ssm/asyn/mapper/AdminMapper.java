package com.ssm.asyn.mapper;

import com.ssm.asyn.pojo.Admin;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface AdminMapper {
    List<Admin> fetchAdmins();
    int insertAdmin(Admin admin);
    int deleteAdminByID(Integer id);
    List<Map> fetchAdminByID(Integer id);
    int updateAdmin(Admin admin);
}
