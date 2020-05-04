package com.example.appointment.modular.doctor.entity;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-05-03
 */
@Data
@TableName("DOCTOR")
@ApiModel(value="Doctor对象", description="")
@KeySequence(value = "SEQ_DOCTOR_ID")
public class Doctor extends Model<Doctor> {

    private static final long serialVersionUID = 1L;

    @TableId("D_ID")
    private Long dId;

    @TableField("D_NAME")
    private String dName;

    @TableField("D_IDCARD")
    private String dIdcard;

    @TableField("D_TELEPHONE")
    private String dTelephone;

    @TableField("D_EMAIL")
    private String dEmail;

    @TableField("D_SEX")
    private String dSex;

    @TableField("D_IDENTITY")
    private String dIdentity;

    @TableField("D_PASSWORD")
    private String dPassword;

    @TableField("D_DEID")
    private Long dDeId;

    @Override
    protected Serializable pkVal() {
        return this.dId;
    }

    @Override
    public String toString() {
        return "Doctor{" +
        "dId=" + dId +
        ", dName=" + dName +
        ", dIdcard=" + dIdcard +
        ", dTelephone=" + dTelephone +
        ", dEmail=" + dEmail +
        ", dSex=" + dSex +
        ", dIdentity=" + dIdentity +
        ", dPassword=" + dPassword +
        ", deId=" + dDeId +
        "}";
    }
}
