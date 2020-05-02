package com.example.appointment.modular.patient.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.appointment.modular.patient.dao.PatientMapper;
import com.example.appointment.modular.patient.entity.Patient;
import com.example.appointment.modular.patient.service.IPatientService;
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
}
