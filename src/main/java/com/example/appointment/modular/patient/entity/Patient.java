package com.example.appointment.modular.patient.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 患者操作
 * @author wangkun
 * @since 2020-03-26
 */
@Data
@TableName("PATIENT")
@KeySequence(value = "SEQ_TESTPLUS_ID")
@ApiModel(value="Patient对象", description="")
public class Patient extends Model<Patient> {

    private static final long serialVersionUID = 1L;
    //此处添加@TableId注解
    @TableId(value = "p_id",type = IdType.INPUT)
    private Long pid;

    @TableField(value = "p_name")
    private String pname;

    @TableField(value = "p_password")
    private String ppassword;

    @TableField(value = "p_idcard")
    private String pidcard;

    @TableField(value = "p_telephone")
    private String ptelephone;

    @TableField(value = "p_identity")
    private String pidentity;

    @TableField(value = "p_email")
    private String pemail;

    @TableField(value = "p_sex")
    private String psex;

    @TableField(value = "p_status")
    private String pstatus;

    @Override
    public String toString() {
        return "Patient{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", ppassword='" + ppassword + '\'' +
                ", pidcard='" + pidcard + '\'' +
                ", ptelephone='" + ptelephone + '\'' +
                ", pidentity=" + pidentity +
                ", pemail='" + pemail + '\'' +
                ", psex='" + psex + '\'' +
                '}';
    }
}
