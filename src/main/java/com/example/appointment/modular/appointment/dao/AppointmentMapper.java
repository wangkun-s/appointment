package com.example.appointment.modular.appointment.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.appointment.modular.appointment.entity.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AppointmentMapper extends BaseMapper<Appointment> {
    List<Appointment> selectAppointment(Long pid);

    int getAppointment(@Param("aPid")Long aPid, @Param("aDate") String aDate);
}
