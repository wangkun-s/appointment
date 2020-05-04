package com.example.appointment.modular.doctor.service;

import com.example.appointment.modular.doctor.entity.Doctor;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
