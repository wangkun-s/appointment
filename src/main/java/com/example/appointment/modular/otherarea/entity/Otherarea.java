package com.example.appointment.modular.otherarea.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangkun
 * @since 2020-05-07
 */
@TableName("OTHERAREA")
@ApiModel(value="Otherarea对象", description="")
public class Otherarea extends Model<Otherarea> {

    private static final long serialVersionUID = 1L;

    @TableField("O_LOCATION")
    private String oLocation;

    @TableField("O_ID")
    private Double oId;

    @TableField("O_JD")
    private Double oJd;

    @TableField("O_WD")
    private Double oWd;

    public String getoLocation() {
        return oLocation;
    }

    public void setoLocation(String oLocation) {
        this.oLocation = oLocation;
    }
    public Double getoId() {
        return oId;
    }

    public void setoId(Double oId) {
        this.oId = oId;
    }
    public Double getoJd() {
        return oJd;
    }

    public void setoJd(Double oJd) {
        this.oJd = oJd;
    }
    public Double getoWd() {
        return oWd;
    }

    public void setoWd(Double oWd) {
        this.oWd = oWd;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Otherarea{" +
        "oLocation=" + oLocation +
        ", oId=" + oId +
        ", oJd=" + oJd +
        ", oWd=" + oWd +
        "}";
    }
}
