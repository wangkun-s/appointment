package com.example.appointment.modular.patient.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.appointment.modular.patient.entity.Patient;
import org.apache.ibatis.annotations.Param;

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

    int selectphone(String ptelephone);

    IPage<Patient> selectAll(Page<Patient> patientPage);
}
