package com.example.appointment.modular.exchange.dao;

import com.example.appointment.modular.exchange.entity.Exchange;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangkun
 * @since 2020-05-07
 */
public interface ExchangeMapper extends BaseMapper<Exchange> {

    int selectexchanges(@Param("eDid") Long eDid, @Param("eDate") String eDate,
                        @Param("eStart") String eStart, @Param("eEnd") String eEnd);

    List<Exchange> getexchange(@Param("eDid") Long eDid, @Param("eDate1")String eDate1, @Param("eDate2")String eDate2, @Param("eDate3")String eDate3,
                               @Param("eDate4") String eDate4, @Param("eDate5")String eDate5, @Param("eDate6")String eDate6, @Param("eDate7")String eDate7);
}
