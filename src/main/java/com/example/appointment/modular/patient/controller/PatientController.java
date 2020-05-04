package com.example.appointment.modular.patient.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.appointment.core.GlobalException;
import com.example.appointment.modular.patient.dao.PatientMapper;
import com.example.appointment.modular.patient.entity.Patient;
import com.example.appointment.modular.patient.service.IPatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 患者操作
 * @author wangkun
 * @since 2020-03-26
 */

@RestController
@RequestMapping("/patient")
@Api(tags = "患者操作模块")
@SuppressWarnings("all")
public class PatientController {

    @Autowired
    private IPatientService iPatientService;
    @Autowired
    private PatientMapper patientMapper;

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
        int count = iPatientService.selectphone(ptelephone);
        if(count == 1){
            Patient patientInfo= iPatientService.selectPassword(ptelephone);
            String password = patientInfo.getPpassword();
            if(password.equals(ppassword)){
                return patientInfo;
            }else {
                throw new GlobalException("密码错误");
            }
        }else{
            throw new GlobalException("手机号不存在");
        }
    }

    @GetMapping("/userinfo")
    @ApiOperation(value = "患者信息")
    public Patient login(@RequestParam String pidcard){
        Patient patientInfo = iPatientService.selectPatient(pidcard);
        return patientInfo;
    }

    @PutMapping("/updatePassword")
    @ApiOperation(value = "患者修改密码")
    public String updatePassword(@RequestParam String ptelephone, @RequestParam String ppassword,
                                  @RequestParam long pid, @RequestParam String pidcard){

        Patient patient = new Patient();
        patient.setPpassword(ppassword);
        int count = patientMapper.update(patient,new UpdateWrapper<Patient>()
                .eq("p_id",pid)
                .eq("p_idcard",pidcard)
                .eq("p_telephone",ptelephone)
        );
        if(count == 1){
            return ppassword;
        }else {
            throw new GlobalException("更新失败");
        }
    }

    @PutMapping("/updateTelephone")
    @ApiOperation(value = "患者修改手机号")
    public String updateTelephone(@RequestParam String xtelephone, @RequestParam String jtelephone,
                                 @RequestParam long pid, @RequestParam String pidcard){

        Patient patient = new Patient();
        patient.setPtelephone(xtelephone);
        int count = patientMapper.update(patient,new UpdateWrapper<Patient>()
                .eq("p_id",pid)
                .eq("p_idcard",pidcard)
                .eq("p_telephone",jtelephone)
        );
        if(count == 1){
            return jtelephone;
        }else {
            throw new GlobalException("更新失败");
        }
    }
    @PutMapping("/updateEmail")
    @ApiOperation(value = "患者修改电子邮箱")
    public String updateEmail(@RequestParam String ptelephone, @RequestParam String pemail,
                                  @RequestParam long pid, @RequestParam String pidcard){

        Patient patient = new Patient();
        patient.setPemail(pemail);
        int count = patientMapper.update(patient,new UpdateWrapper<Patient>()
                .eq("p_id",pid)
                .eq("p_idcard",pidcard)
                .eq("p_telephone",ptelephone)
        );
        if(count == 1){
            return pemail;
        }else {
            throw new GlobalException("更新失败");
        }
    }

}
