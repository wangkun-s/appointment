package com.example.appointment.modular.doctor.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.appointment.modular.appointment.entity.Appointment;
import com.example.appointment.modular.doctor.entity.Doctor;
import com.example.appointment.modular.doctor.dao.DoctorMapper;
import com.example.appointment.modular.doctor.service.IDoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangkun
 * @since 2020-05-03
 */
@Service
@SuppressWarnings("all")
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements IDoctorService {
    @Autowired
    DoctorMapper doctorMapper;
    @Override
    public List<Doctor> selectdoctor(Long dDeId) {
        return doctorMapper.selectdoctor(dDeId);
    }

    @Override
    public Doctor selectAdmin(@Param("did") Long did, @Param("dpassword") String dpassword,@Param("didentity") String didentity) {
        return doctorMapper.selectAdmin(did,dpassword,didentity);
    }

    @Override
    public IPage<Doctor> selectAll(int current, int size) {
        Page<Doctor> doctorPage = new Page<>(current, size);
        return doctorMapper.selectAll(doctorPage);
    }

    @Override
    public int updateStatus(Long did) {
        return doctorMapper.updateStatus(did);
    }

    @Override
    public Doctor doctorinfo(Long did) {
        return doctorMapper.doctorinfo(did);
    }

    @Override
    public List<Doctor> doctorsinfo() {
        return doctorMapper.doctorsinfo();
    }


}
