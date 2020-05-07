package com.example.appointment.modular.exchange.controller;


import com.example.appointment.core.GlobalException;
import com.example.appointment.modular.exchange.entity.Exchange;
import com.example.appointment.modular.exchange.service.IExchangeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import oracle.jdbc.proxy.annotation.Post;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangkun
 * @since 2020-05-07
 */
@RestController
@RequestMapping("/exchange")
@Api(tags = "医生模块")
public class ExchangeController {
    @Autowired
    IExchangeService iExchangeService;

    @PostMapping("/exchange")
    @ApiOperation(value = "申请调休")
    public boolean exchanges(@RequestBody Exchange exchange){
        Long eDid = exchange.getEDid();
        String eDate = exchange.getEDate();
        String eStart = exchange.getEStart();
        String eEnd = exchange.getEEnd();
        int count = iExchangeService.selectexchanges(eDid,eDate,eStart,eEnd);
        if(count==0){
            return iExchangeService.save(exchange);
        }else{
            throw new GlobalException("此时间段已被预约");
        }
    }

    @GetMapping("/getexchange")
    @ApiOperation(value = "时间安排")
    public List<Exchange> getexchange(@RequestParam Long eDid,@RequestParam String eDate1,@RequestParam String eDate2,
    @RequestParam String eDate3,@RequestParam String eDate4,@RequestParam String eDate5,@RequestParam String eDate6,
                                      @RequestParam String eDate7){
        List<Exchange> exchangeList = iExchangeService.getexchange(eDid,eDate1,eDate2,eDate3,eDate4,eDate5,eDate6,eDate7);
        return exchangeList;
    }

}
