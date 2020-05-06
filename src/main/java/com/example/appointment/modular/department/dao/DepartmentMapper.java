package com.example.appointment.modular.department.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.appointment.modular.department.entity.Department;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangkun
 * @since 2020-05-03
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    List<Department> selectkeshi();

    List<Department> selectinfo();

}
