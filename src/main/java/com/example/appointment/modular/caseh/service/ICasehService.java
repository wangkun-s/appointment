package com.example.appointment.modular.caseh.service;

import com.example.appointment.modular.caseh.entity.Caseh;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangkun
 * @since 2020-05-06
 */
public interface ICasehService extends IService<Caseh> {

    Caseh addcaseh(Caseh caseh);

    Caseh watchbingli(Long caid);
}
