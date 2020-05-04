package com.example.appointment.modular.appointment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.appointment.modular.appointment.entity.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IAppointmentService extends IService<Appointment> {
    List<Appointment> selectAppointment(Long pid);

    int getAppointment(@Param("aPid")Long aPid, @Param("aDate")String aDate);
}
