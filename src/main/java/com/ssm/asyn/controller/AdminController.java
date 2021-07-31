package com.ssm.asyn.controller;

import com.ssm.asyn.pojo.Admin;
import com.ssm.asyn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Di Guan on 7/31/2021 9:18 PM
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/fetchAdmins")
    @ResponseBody
    public List<Admin> fetchAdmins(){
        System.out.println(123);
        return adminService.fetchAdmins();
    }


}
