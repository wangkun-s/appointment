package com.example.appointment.modular.doctor.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.appointment.modular.appointment.entity.Appointment;
import com.example.appointment.modular.doctor.entity.Doctor;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangkun
 * @since 2020-05-03
 */
public interface IDoctorService extends IService<Doctor> {

    List<Doctor> selectdoctor(Long dDeId);

    Doctor selectAdmin(@Param("did") Long did, @Param("dpassword") String dpassword, @Param("didentity") String didentity);

    IPage<Doctor> selectAll(int page, int size);

    int updateStatus(Long did);

    Doctor doctorinfo(Long did);


    List<Doctor> doctorsinfo();
}
