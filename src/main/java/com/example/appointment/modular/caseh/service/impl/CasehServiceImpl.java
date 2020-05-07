package com.example.appointment.modular.caseh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.appointment.modular.caseh.entity.Caseh;
import com.example.appointment.modular.caseh.dao.CasehMapper;
import com.example.appointment.modular.caseh.service.ICasehService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangkun
 * @since 2020-05-06
 */
@Service
@SuppressWarnings("all")
public class CasehServiceImpl extends ServiceImpl<CasehMapper, Caseh> implements ICasehService {

    @Autowired
    CasehMapper casehMapper;

    @Override
    public Caseh addcaseh(Caseh caseh) {
        return casehMapper.addcaseh(caseh);
    }

    @Override
    public Caseh watchbingli(Long caid) {
        return casehMapper.watchbingli(caid);
    }
}
