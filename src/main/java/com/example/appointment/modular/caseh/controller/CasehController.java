package com.example.appointment.modular.caseh.controller;


import com.example.appointment.core.GlobalException;
import com.example.appointment.modular.caseh.dao.CasehMapper;
import com.example.appointment.modular.caseh.entity.Caseh;
import com.example.appointment.modular.caseh.service.ICasehService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangkun
 * @since 2020-05-06
 */
@RestController
@RequestMapping("/caseh")
@Api(tags = "电子病历")
public class CasehController {

    @Autowired
    ICasehService iCasehService;

    @PostMapping("/addcaseh")
    @ApiOperation(value = "保存电子病历")
    public Caseh addcaseh(@RequestBody Caseh caseh){
        boolean flag = iCasehService.save(caseh);
        if(flag == true){
            return caseh;
        }else{
            throw new GlobalException("填写失败");
        }
    }

    @GetMapping("/watchbingli")
    @ApiOperation(value = "查看电子病历")
    public Caseh watchbingli(@RequestParam Long caid){
        Caseh caseh = iCasehService.watchbingli(caid);
        return caseh;
    }

}
