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

}
