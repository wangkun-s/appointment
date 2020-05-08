package com.example.appointment.modular.department.controller;


import com.example.appointment.modular.department.entity.Department;
import com.example.appointment.modular.department.service.IDepartmentService;
import com.example.appointment.modular.patient.entity.Patient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangkun
 * @since 2020-05-03
 */
@RestController
@RequestMapping("/department")
@Api(tags = "科室模块")
public class DepartmentController {

    @Autowired
    IDepartmentService iDepartmentService;


    @GetMapping("/selectinfo")
    @ApiOperation(value = "科室医生信息")
    public List<Department> selectinfo(){
        List<Department> departmentList = iDepartmentService.selectinfo();
        return departmentList;
    }


    @GetMapping("/selectkeshi")
    @ApiOperation(value = "科室信息")
    public List<Department> selectkeshi(){
        List<Department> departmentList = iDepartmentService.selectkeshi();
        return departmentList;
    }

    @PostMapping("/addDepartment")
    @ApiOperation(value = "创建科室")
    public boolean addDepartment(@RequestBody Department department){
        boolean flag = iDepartmentService.save(department);
        if(flag == true){
            return true;
        }else{
            return false;
        }
    }

    @GetMapping("/selectid")
    @ApiOperation(value = "根据id查询科室信息")
    public Department selectid(@RequestParam Long deId){
        Department departmentList = iDepartmentService.getById(deId);
        return departmentList;
    }
}
