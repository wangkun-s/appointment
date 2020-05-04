package com.example.appointment.modular.doctor.service.impl;

import com.example.appointment.modular.doctor.entity.Doctor;
import com.example.appointment.modular.doctor.dao.DoctorMapper;
import com.example.appointment.modular.doctor.service.IDoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
}
