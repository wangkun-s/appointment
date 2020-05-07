package com.example.appointment.modular.caseh.entity;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.sql.Clob;
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
 * @since 2020-05-06
 */
@Data
@TableName("CASEH")
@ApiModel(value="Caseh对象", description="")
@KeySequence(value = "SEQ_CASEH_ID")
public class Caseh extends Model<Caseh> {

    private static final long serialVersionUID = 1L;

    @TableId("C_ID")
    private Long cId;

    @TableField("C_PSEX")
    private String cPsex;

    @TableField("C_PIDCARD")
    private String cPidcard;

    @TableField("C_PTELEPHONE")
    private String cPtelephone;

    @TableField("C_DENAME")
    private String cDename;

    @TableField("C_DNAME")
    private String cDname;

    @TableField("C_ADATE")
    private String cAdate;

    @TableField("C_TYPE")
    private String cType;

    @TableField("C_ZHUSU")
    private String cZhusu;

    @TableField("C_SHOUFEI")
    private String cShoufei;

    @TableField("C_YIZHU")
    private String cYizhu;

    @TableField("C_AID")
    private Long cAid;

    @TableField("C_DEID")
    private Long cDeid;

    @TableField("C_DID")
    private Long cDid;

    @TableField("C_PID")
    private Long cPid;

    @TableField("C_PNAME")
    private String cPname;

    @Override
    protected Serializable pkVal() {
        return this.cId;
    }

    @Override
    public String toString() {
        return "Caseh{" +
        "cId=" + cId +
        ", cPsex=" + cPsex +
        ", cPidcard=" + cPidcard +
        ", cPtelephone=" + cPtelephone +
        ", cDename=" + cDename +
        ", cDname=" + cDname +
        ", cAdate=" + cAdate +
        ", cType=" + cType +
        ", cZhusu=" + cZhusu +
        ", cShoufei=" + cShoufei +
        ", cYizhu=" + cYizhu +
        ", cAid=" + cAid +
        ", cDeid=" + cDeid +
        ", cDid=" + cDid +
        ", cPid=" + cPid +
        "}";
    }
}
