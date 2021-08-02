package com.ssm.rest;

import com.ssm.asyn.pojo.Admin;
import com.ssm.asyn.pojo.ReturnResult;
import com.ssm.asyn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;

/**
 * REST风格
 *
 * @author Di Guan on 8/2/2021 10:41 AM
 */
@RestController
@RequestMapping("/restAdmin")
public class AdminRESTController {

    @Autowired
    private AdminService adminService;

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ReturnResult fetchAdmins(){
        System.out.println("Im in");
        return adminService.fetchAdmins();
    }

//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public ReturnResult insertAdmin(Admin admin){
        System.out.println(admin);
        return adminService.insertAdmin(admin);
    }

//    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    @DeleteMapping(value = "/{id}")
    public ReturnResult deleteAdminByID(@PathVariable("id") Integer id){
        System.out.println(id);
        return adminService.deleteAdminByID(id);
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @GetMapping(value = "/{id}")
    public ReturnResult fecthAdminByID(@PathVariable("id") Integer id){
        System.out.println(id);
        return adminService.fetchAdminByID(id);
    }

//    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public ReturnResult updateAdmin(@RequestBody Admin admin){
        System.out.println(admin);
        return adminService.updateAdmin(admin);
    }
}
