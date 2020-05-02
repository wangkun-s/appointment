package com.example.appointment.modular.patient.controller;


import com.example.appointment.core.GlobalException;
import com.example.appointment.modular.patient.entity.Patient;
import com.example.appointment.modular.patient.service.IPatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 患者操作
 * @author wangkun
 * @since 2020-03-26
 */

@RestController
@RequestMapping("/patient")
@Api(tags = "患者操作模块")
public class PatientController {

    @Autowired
    private IPatientService iPatientService;

    @PostMapping("/register")
    @ApiOperation(value = "患者注册")
    public Patient register(@RequestBody Patient patient){
        String pidcard = patient.getPidcard();
        int count = iPatientService.selectIdCard(pidcard);
            if (count == 0) {
                boolean flag = iPatientService.save(patient);
                if (flag == true) {
                    Patient patientInfo = iPatientService.selectPatient(pidcard);
                    return patientInfo;
                } else {
                   throw new GlobalException("用户注册失败");
                }
            } else {
                throw new GlobalException("身份证号码已存在");
        }

    }

    @GetMapping("/login")
    @ApiOperation(value = "患者登录")
    public Patient login(@RequestParam String ptelephone, @RequestParam String ppassword){
        Patient patientInfo= iPatientService.selectPassword(ptelephone);
        String password = patientInfo.getPpassword();
        if(password.equals(ppassword)){
            return patientInfo;
        }else {
            throw new GlobalException("手机号或密码错误");
        }
    }

//    @GetMapping("/updateInformation")
//    @ApiOperation(value = "患者修改个人信息")
//    public boolean updateInformation(@RequestBody Patient patient){
//
//    }

}
