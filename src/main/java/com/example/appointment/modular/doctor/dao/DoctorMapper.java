package com.example.appointment.modular.doctor.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.appointment.modular.appointment.entity.Appointment;
import com.example.appointment.modular.doctor.entity.Doctor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

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

    Doctor selectAdmin(@Param("did") Long did, @Param("dpassword")String dpassword, @Param("didentity")String didentity);

    IPage<Doctor> selectAll(IPage<Doctor> page);

    int updateStatus(Long did);

    Doctor doctorinfo(Long did);


    List<Doctor> doctorsinfo();
}
