package com.example.appointment.modular.caseh.dao;

import com.example.appointment.modular.caseh.entity.Caseh;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangkun
 * @since 2020-05-06
 */
public interface CasehMapper extends BaseMapper<Caseh> {

    Caseh addcaseh(Caseh caseh);

    Caseh watchbingli(Long caid);
}
