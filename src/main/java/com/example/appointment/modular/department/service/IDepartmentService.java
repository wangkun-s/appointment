package com.example.appointment.modular.department.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.appointment.modular.department.entity.Department;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangkun
 * @since 2020-05-03
 */
public interface IDepartmentService extends IService<Department> {

    List<Department> selectkeshi();

    List<Department> selectinfo();

}
