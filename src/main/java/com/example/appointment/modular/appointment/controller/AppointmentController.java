package com.example.appointment.modular.appointment.controller;

import com.example.appointment.core.GlobalException;
import com.example.appointment.modular.appointment.entity.Appointment;
import com.example.appointment.modular.appointment.service.IAppointmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangkun
 * @description
 * @date 2020/5/4
 */
@RestController
@RequestMapping("/appointment")
@Api(tags = "预约模块")
public class AppointmentController {

    @Autowired
    IAppointmentService iAppointmentService;

    @PostMapping("/addAppointment")
    @ApiOperation(value = "增加预约信息")
    public boolean addAppointment(@RequestBody Appointment appointment){
        Long aPid = appointment.getAPid();
        String aDate = appointment.getADate();
        int count = iAppointmentService.getAppointment(aPid, aDate);
        if(count==0){
            return iAppointmentService.save(appointment);
        }else {
            throw new GlobalException("同一天内只能预约一次");
        }

    }

    @GetMapping("/selectAppointment")
    @ApiOperation(value = "查询预约信息")
    public List<Appointment> selectAppointment(@RequestParam Long pid){
        return iAppointmentService.selectAppointment(pid);
    }

    @GetMapping("/doctorAppointment")
    @ApiOperation(value = "医生查看个人预约")
    public List<Appointment> doctorAppointment(@RequestParam Long did){
        List<Appointment> appointmentList = iAppointmentService.doctorAppointment(did);
        return appointmentList;
    }

    @GetMapping("/appointmentinfo")
    @ApiOperation(value = "查看预约患者基本信息")
    public Appointment appointmentinfo(@RequestParam Long pid,@RequestParam Long aid){
        Appointment appointmentList = iAppointmentService.appointmentinfo(pid,aid);
        return appointmentList;
    }

    @PutMapping ("/updateStatus")
    @ApiOperation(value = "改变状态")
    public boolean updateStatus(@RequestParam Long aid){
         int count = iAppointmentService.updateStatus(aid);
         if( count== 1){
             return true;
         }else{
             return false;
         }
    }

    @GetMapping("/falsepatient")
    @ApiOperation(value = "查看已完成患者")
    public List<Appointment> falsepatient(@RequestParam String aStatus,@RequestParam Long aDid){
        List<Appointment> appointmentList = iAppointmentService.falsepatient(aStatus,aDid);
        return appointmentList;
    }

    @GetMapping("/falsep")
    @ApiOperation(value = "患者查看已完成患者")
    public List<Appointment> falsep(@RequestParam String aStatus,@RequestParam Long apid){
        List<Appointment> appointmentList = iAppointmentService.falsep(aStatus,apid);
        return appointmentList;
    }

    @GetMapping("/select")
    @ApiOperation(value = "根据手机号查询患者")
    public List<Appointment> select(@RequestParam String atelephone,@RequestParam Long aDid){
        List<Appointment> appointmentList = iAppointmentService.select(atelephone,aDid);
        return appointmentList;
    }
}
