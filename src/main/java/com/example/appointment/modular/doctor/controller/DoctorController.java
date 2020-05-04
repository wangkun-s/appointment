package com.example.appointment.modular.doctor.controller;


import com.example.appointment.modular.department.entity.Department;
import com.example.appointment.modular.doctor.entity.Doctor;
import com.example.appointment.modular.doctor.service.IDoctorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/doctor")
@Api(tags = "医生模块")
public class DoctorController {
    @Autowired
    IDoctorService iDoctorService;

    @GetMapping("/selectdoctor")
    @ApiOperation(value = "医生信息")
    public List<Doctor> selectdoctor(Long dDeId){
        List<Doctor> doctorList = iDoctorService.selectdoctor(dDeId);
        return doctorList;
    }

}
