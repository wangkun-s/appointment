package com.example.appointment.modular.department.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.time.LocalDateTime;
import java.sql.Clob;
import java.io.Serializable;
import java.util.List;

import com.example.appointment.modular.doctor.entity.Doctor;
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
@TableName("DEPARTMENT")
@ApiModel(value="Department对象", description="科室")
@KeySequence(value = "SEQ_DEPARTMENT_ID")
public class Department extends Model<Department> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "DE_ID",type = IdType.INPUT)
    private Long deId;

    @TableField("DE_NAME")
    private String deName;

    @TableField("DE_TIME")
    private LocalDateTime deTime;

    @TableField("DE_DESCRIPTION")
    private String deDescription;

    @TableField("DE_REMARK")
    private String deRemark;

    @TableField(exist = false)
    private List<Doctor> doctor;


    @Override
    protected Serializable pkVal() {
        return this.deId;
    }

    @Override
    public String toString() {
        return "Department{" +
        "deId=" + deId +
        ", deName=" + deName +
        ", deTime=" + deTime +
        ", deDescription=" + deDescription +
        ", deRemark=" + deRemark +
        "}";
    }
}
