package com.example.appointment.modular.otherarea.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author wangkun
 * @since 2020-05-08
 */
@Data
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

    @TableField("O_LOCAL")
    private String oLocal;

    @TableField("O_PHONE")
    private String oPhone;


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
                ", oLocal=" + oLocal +
                ", oPhone=" + oPhone +
                "}";
    }
}
