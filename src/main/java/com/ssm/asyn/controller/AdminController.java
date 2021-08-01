package com.ssm.asyn.controller;

import com.ssm.asyn.pojo.Admin;
import com.ssm.asyn.pojo.ReturnResult;
import com.ssm.asyn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 异步CRUD controller
 * @author Di Guan on 7/31/2021 9:18 PM
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/fetchAdmins")
    @ResponseBody
    public ReturnResult fetchAdmins(){
        return adminService.fetchAdmins();
    }

    @RequestMapping("/insertAdmin")
    @ResponseBody
    public ReturnResult insertAdmin(Admin admin){
        System.out.println(admin);
        return adminService.insertAdmin(admin);
    }

    @RequestMapping("/deleteAdmin")
    @ResponseBody
    public ReturnResult deleteAdmin(Integer id){
        System.out.println(id);
        return adminService.deleteAdminByID(id);
    }

    @RequestMapping("/fetchAdminByID")
    @ResponseBody
    public ReturnResult fetchAdminByID(Integer id){
        return adminService.fetchAdminByID(id);
    }

    @RequestMapping("/updateAdmin")
    @ResponseBody
    public ReturnResult updateAdmin(Admin admin){
        System.out.println(admin);
        return adminService.updateAdmin(admin);
    }
}
