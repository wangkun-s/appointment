package com.example.appointment.modular.otherarea.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.appointment.modular.otherarea.entity.Otherarea;
import com.example.appointment.modular.otherarea.dao.OtherareaMapper;
import com.example.appointment.modular.otherarea.service.IOtherareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangkun
 * @since 2020-05-07
 */
@Service
@SuppressWarnings("all")
public class OtherareaServiceImpl extends ServiceImpl<OtherareaMapper, Otherarea> implements IOtherareaService {
    @Autowired
    OtherareaMapper otherareaMapper;
    @Override
    public List<Otherarea> otherarea(String olocal) {
        return otherareaMapper.otherarea(olocal);
    }
}
