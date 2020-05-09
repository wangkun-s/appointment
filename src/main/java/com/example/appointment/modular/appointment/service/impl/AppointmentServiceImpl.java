package com.example.appointment.modular.appointment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.appointment.modular.appointment.dao.AppointmentMapper;
import com.example.appointment.modular.appointment.entity.Appointment;

import com.example.appointment.modular.appointment.service.IAppointmentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangkun
 * @description
 * @date 2020/5/4
 */
@Service
@SuppressWarnings("all")
public class AppointmentServiceImpl extends ServiceImpl<AppointmentMapper, Appointment> implements IAppointmentService {
    @Autowired
    AppointmentMapper appointmentMapper;
    @Override
    public List<Appointment> selectAppointment(Long pid) {
        return appointmentMapper.selectAppointment(pid);
    }

    @Override
    public int getAppointment(@Param("aPid") Long aPid, @Param("aDate") String aDate) {
        return appointmentMapper.getAppointment(aPid,aDate);
    }

    @Override
    public List<Appointment> doctorAppointment(Long did) {
        return appointmentMapper.doctorAppointment(did);
    }

    @Override
    public Appointment appointmentinfo(@Param("pid")Long pid,@Param("aid") Long aid) {
        return appointmentMapper.appointmentinfo(pid,aid);
    }

    @Override
    public int updateStatus(Long aid) {
        return appointmentMapper.updateStatus(aid);
    }

    @Override
    public List<Appointment> falsepatient(@Param("aStatus") String aStatus,@Param("aDid") Long aDid) {
        return appointmentMapper.falsepatient(aStatus,aDid);
    }

    @Override
    public List<Appointment> select(@Param("atelephone") String atelephone,@Param("aDid") Long aDid) {
        return appointmentMapper.select(atelephone,aDid);
    }

    @Override
    public List<Appointment> falsep(@Param("aStatus")String aStatus, @Param("apid")Long apid) {
        return appointmentMapper.falsep(aStatus,apid);
    }

    @Override
    public int getDoctorExchange(@Param("eDid") Long eDid, @Param("eDate") String eDate,
                                 @Param("eStart") String eStart, @Param("eEnd") String eEnd) {
        return appointmentMapper.getDoctorExchange(eDid,eDate,eStart,eEnd);
    }
}
