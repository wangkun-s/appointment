package com.example.appointment.modular.patient.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.appointment.modular.patient.entity.Patient;

import java.util.List;

/**
 * 患者操作
 * @author wangkun
 * @since 2020-03-26
 */
public interface PatientMapper extends BaseMapper<Patient> {
    int selectIdCard(String pidcard);

    Patient selectPassword(String ptelephone);

    Patient selectPatient(String pidcard);
}
