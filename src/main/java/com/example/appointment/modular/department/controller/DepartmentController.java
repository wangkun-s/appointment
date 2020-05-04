package com.example.appointment.modular.department.controller;


import com.example.appointment.modular.department.entity.Department;
import com.example.appointment.modular.department.service.IDepartmentService;
import com.example.appointment.modular.patient.entity.Patient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
