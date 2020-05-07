package com.example.appointment.modular.exchange.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.appointment.modular.exchange.entity.Exchange;
import com.example.appointment.modular.exchange.dao.ExchangeMapper;
import com.example.appointment.modular.exchange.service.IExchangeService;
import org.apache.ibatis.annotations.Param;
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
public class ExchangeServiceImpl extends ServiceImpl<ExchangeMapper, Exchange> implements IExchangeService {

    @Autowired
    ExchangeMapper exchangeMapper;

    @Override
    public int selectexchanges(@Param("eDid") Long eDid, @Param("eDate") String eDate,
                               @Param("eStart") String eStart, @Param("eEnd") String eEnd) {

        return exchangeMapper.selectexchanges(eDid,eDate,eStart,eEnd);
    }

    @Override
    public List<Exchange> getexchange(@Param("eDid") Long eDid, @Param("eDate1")String eDate1, @Param("eDate2")String eDate2, @Param("eDate3")String eDate3,
                                      @Param("eDate4") String eDate4, @Param("eDate5")String eDate5, @Param("eDate6")String eDate6, @Param("eDate7")String eDate7) {
        return exchangeMapper.getexchange(eDid,eDate1,eDate2,eDate3,eDate4,eDate5,eDate6,eDate7);
    }
}
