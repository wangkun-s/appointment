package com.example.appointment.modular.patient.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.appointment.core.GlobalException;
import com.example.appointment.modular.doctor.entity.Doctor;
import com.example.appointment.modular.patient.dao.PatientMapper;
import com.example.appointment.modular.patient.entity.Patient;
import com.example.appointment.modular.patient.service.IPatientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 患者操作
 * @author wangkun
 * @since 2020-03-26
 */
@Service
@SuppressWarnings("all")
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements IPatientService {

    @Autowired
    private PatientMapper patientMapper;
    @Override
    public int selectIdCard(String pidcard) {
        int count = patientMapper.selectIdCard(pidcard);
        return count;
    }

    @Override
    public Patient selectPassword(String ptelephone) {
        return patientMapper.selectPassword(ptelephone);
    }

    @Override
    public Patient selectPatient(String pidcard) {
        return patientMapper.selectPatient(pidcard);
    }

    @Override
    public int selectphone(String ptelephone) {
        return patientMapper.selectphone(ptelephone);
    }

    @Override
    public IPage<Patient> selectAll(int current, int size) {
        Page<Patient> patientPage = new Page<>(current, size);
        return patientMapper.selectAll(patientPage);
    }

}
