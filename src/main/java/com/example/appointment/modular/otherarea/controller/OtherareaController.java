package com.example.appointment.modular.otherarea.controller;


import com.example.appointment.modular.otherarea.entity.Otherarea;
import com.example.appointment.modular.otherarea.service.IOtherareaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/otherarea")
@Api(tags = "其他地区")
public class OtherareaController {
    @Autowired
    IOtherareaService iOtherareaService;

    @GetMapping("/otherarea")
    @ApiOperation(value = "其他地区信息")
    public List<Otherarea> otherarea(@RequestParam String olocal){
        List<Otherarea> otherareaList = iOtherareaService.otherarea(olocal);
        return otherareaList;
    }
}
