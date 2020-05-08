package com.example.appointment.modular.otherarea.service;

import com.example.appointment.modular.otherarea.entity.Otherarea;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangkun
 * @since 2020-05-07
 */
public interface IOtherareaService extends IService<Otherarea> {

    List<Otherarea> otherarea(String olocal);
}
