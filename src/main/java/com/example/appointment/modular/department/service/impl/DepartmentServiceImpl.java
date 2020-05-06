package com.example.appointment.modular.department.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.appointment.modular.department.dao.DepartmentMapper;
import com.example.appointment.modular.department.entity.Department;
import com.example.appointment.modular.department.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    @Autowired DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectkeshi() {
        return departmentMapper.selectkeshi();
    }

    @Override
    public List<Department> selectinfo() {
        return departmentMapper.selectinfo();
    }

}
