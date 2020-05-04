package com.example.appointment.modular.doctor.dao;

import com.example.appointment.modular.doctor.entity.Doctor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangkun
 * @since 2020-05-03
 */
public interface DoctorMapper extends BaseMapper<Doctor> {

    List<Doctor> selectdoctor(Long dDeId);
}
