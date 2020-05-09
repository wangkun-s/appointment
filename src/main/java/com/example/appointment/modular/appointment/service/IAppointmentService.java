package com.example.appointment.modular.appointment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.appointment.modular.appointment.entity.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IAppointmentService extends IService<Appointment> {
    List<Appointment> selectAppointment(Long pid);

    int getAppointment(@Param("aPid")Long aPid, @Param("aDate")String aDate);

    List<Appointment> doctorAppointment(Long did);

    Appointment appointmentinfo(@Param("pid")Long pid,@Param("aid") Long aid);

    int updateStatus(Long aid);

    List<Appointment> falsepatient(@Param("aStatus") String aStatus,@Param("aDid") Long aDid);

    List<Appointment> select(@Param("atelephone") String atelephone,@Param("aDid") Long aDid);

    List<Appointment> falsep(@Param("aStatus") String aStatus,@Param("aDid") Long apid);
}
