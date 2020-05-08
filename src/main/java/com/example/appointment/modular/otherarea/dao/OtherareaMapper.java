package com.example.appointment.modular.otherarea.dao;

import com.example.appointment.modular.otherarea.entity.Otherarea;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangkun
 * @since 2020-05-07
 */
public interface OtherareaMapper extends BaseMapper<Otherarea> {

    List<Otherarea> otherarea(String olocal);
}
