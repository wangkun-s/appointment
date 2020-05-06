package com.example.appointment.modular.doctor.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.appointment.core.GlobalException;
import com.example.appointment.modular.department.entity.Department;
import com.example.appointment.modular.doctor.entity.Doctor;
import com.example.appointment.modular.doctor.service.IDoctorService;
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
@RequestMapping("/doctor")
@Api(tags = "医生模块")
public class DoctorController {
    @Autowired
    IDoctorService iDoctorService;

    @GetMapping("/selectdoctor")
    @ApiOperation(value = "医生信息")
    public List<Doctor> selectdoctor(@RequestParam Long dDeId){
        List<Doctor> doctorList = iDoctorService.selectdoctor(dDeId);
        return doctorList;
    }

    @GetMapping("/admin")
    @ApiOperation(value = "管理端登录")
    public Doctor selectAdmin(@RequestParam Long did,@RequestParam String dpassword,
                        @RequestParam String didentity){
        Doctor doctor = iDoctorService.selectAdmin(did,dpassword,didentity);
        if(doctor!=null){
            return doctor;
        }else{
            throw new GlobalException("登录失败，请检查各项信息填写");
        }
    }

    @PostMapping("/addDoctor")
    @ApiOperation(value = "创建医生")
    public boolean addDoctor(@RequestBody Doctor doctor){
        boolean flag=iDoctorService.save(doctor);
        if(flag == true){
            return true;
        }else{
            return false;
        }
    }

    @GetMapping("/selectAll")
    @ApiOperation(value = "查询医生所有信息")
    public IPage<Doctor> selectAll(
                                   @RequestParam(value = "current", defaultValue = "1", required = false) int current,
                                   @RequestParam(value = "size", defaultValue = "10", required = false) int size){
        return iDoctorService.selectAll(current,size);
    }

    @PutMapping("/updateStatus")
    @ApiOperation(value = "医生状态")
    public boolean addDoctor(@RequestParam Long did){
        int flag=iDoctorService.updateStatus(did);
        if(flag == 1){
            return true;
        }else{
            return false;
        }
    }
}
