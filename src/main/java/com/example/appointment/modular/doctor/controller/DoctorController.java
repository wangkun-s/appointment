package com.example.appointment.modular.doctor.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.appointment.core.GlobalException;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.appointment.modular.appointment.entity.Appointment;
import com.example.appointment.modular.doctor.dao.DoctorMapper;
import com.example.appointment.modular.doctor.entity.Doctor;
import com.example.appointment.modular.doctor.service.IDoctorService;
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
@RequestMapping("/doctor")
@Api(tags = "医生模块")
@SuppressWarnings("all")
public class DoctorController {
    @Autowired
    IDoctorService iDoctorService;
    @Autowired
    DoctorMapper doctorMapper;

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
        String didcard = doctor.getDIdcard();
        int count = iDoctorService.didcard(didcard);
        if(count == 0){
            boolean flag=iDoctorService.save(doctor);
            if(flag == true){
                return true;
            }else{
                throw new GlobalException("创建失败");
            }
        }else{
            throw new GlobalException("请检查身份证号码");
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

    @GetMapping("/doctorinfo")
    @ApiOperation(value = "医生信息")
    public Doctor doctorinfo(@RequestParam Long did){
        Doctor doctor = iDoctorService.doctorinfo(did);
        return doctor;
    }


    @PutMapping("/updatePassword")
    @ApiOperation(value = "医生修改密码")
    public String updatePassword(@RequestParam String dtelephone, @RequestParam String dpassword,
                                 @RequestParam Long did, @RequestParam String didcard){

        Doctor doctor = new Doctor();
        doctor.setDPassword(dpassword);
        int count = doctorMapper.update(doctor,new UpdateWrapper<Doctor>()
                .eq("d_id",did)
                .eq("d_idcard",didcard)
                .eq("d_telephone",dtelephone)
        );
        if(count == 1){
            return dpassword;
        }else {
            throw new GlobalException("更新失败");
        }
    }

    @PutMapping("/updateTelephone")
    @ApiOperation(value = "医生修改手机号")
    public String updateTelephone(@RequestParam String xtelephone, @RequestParam String jtelephone,
                                  @RequestParam Long did, @RequestParam String didcard){

        Doctor doctor = new Doctor();
        doctor.setDTelephone(xtelephone);
        int count = doctorMapper.update(doctor,new UpdateWrapper<Doctor>()
                .eq("d_id",did)
                .eq("d_idcard",didcard)
                .eq("d_telephone",jtelephone)
        );
        if(count == 1){
            return jtelephone;
        }else {
            throw new GlobalException("更新失败");
        }
    }

    @PutMapping("/updateEmail")
    @ApiOperation(value = "医生修改电子邮箱")
    public String updateEmail(@RequestParam String dtelephone, @RequestParam String demail,
                              @RequestParam Long did, @RequestParam String didcard){

        Doctor doctor = new Doctor();
        doctor.setDEmail(demail);
        int count = doctorMapper.update(doctor,new UpdateWrapper<Doctor>()
                .eq("d_id",did)
                .eq("d_idcard",didcard)
                .eq("d_telephone",dtelephone)
        );
        if(count == 1){
            return demail;
        }else {
            throw new GlobalException("更新失败");
        }
    }

    @GetMapping("/doctorsinfo")
    @ApiOperation(value = "专家推荐")
    public List<Doctor> doctorsinfo(){
        List<Doctor> doctor = iDoctorService.doctorsinfo();
        return doctor;
    }

    @GetMapping("/persondoctor")
    @ApiOperation(value = "医生信息")
    public List<Doctor> persondoctor(@RequestParam String didcard,@RequestParam String dtelephone){
        List<Doctor> doctorList = iDoctorService.persondoctor(didcard,dtelephone);
        return doctorList;
    }
}
