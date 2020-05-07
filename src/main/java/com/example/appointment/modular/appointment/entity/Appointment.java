package com.example.appointment.modular.appointment.entity;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 *
 * @author wangkun
 * @since 2020-03-26
 */
@Data
@TableName("APPOINTMENT")
@KeySequence(value = "SEQ_APPOINTMENT_ID")
@ApiModel(value="APPOINTMENT对象", description="")
public class Appointment extends Model<Appointment> {

    private static final long serialVersionUID = 1L;
    //此处添加@TableId注解
    @TableId(value = "A_ID",type = IdType.INPUT)
    private Long aId;

    @TableField(value = "A_START")
    private String aStart;

    @TableField(value = "A_END")
    private String aEnd;

    @TableField(value = "A_DATE")
    private String aDate;

    @TableField(value = "A_DID")
    private Long aDid;

    @TableField(value = "A_DEID")
    private Long aDeid;

    @TableField(value = "A_TELEPHONE")
    private String aTelephone;

    @TableField(value = "A_PID")
    private Long aPid;

    @TableField(exist = false)
    private String deName;

    @TableField(exist = false)
    private String dName;

    @TableField(exist = false)
    private String pName;

    @TableField(exist = false)
    private String pIdcard;

    @TableField(exist = false)
    private String pSex;

    @TableField(value = "A_STATUS")
    private String aStatus;

    @Override
    public String toString() {
        return "Appointment{" +
                "aId=" + aId +
                ", aStart='" + aStart + '\'' +
                ", aEnd='" + aEnd + '\'' +
                ", aDate='" + aDate + '\'' +
                ", aDid=" + aDid +
                ", aDeid=" + aDeid +
                ", aTelephone='" + aTelephone + '\'' +
                ", aPid='" + aPid + '\'' +
                '}';
    }
}
