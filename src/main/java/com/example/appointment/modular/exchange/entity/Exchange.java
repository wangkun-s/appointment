package com.example.appointment.modular.exchange.entity;

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
 * @since 2020-05-07
 */
@Data
@TableName("EXCHANGE")
@ApiModel(value="Exchange对象", description="")
@KeySequence(value = "SEQ_EXCHANGE_ID")
public class Exchange extends Model<Exchange> {

    private static final long serialVersionUID = 1L;

    @TableId("E_ID")
    private Long eId;

    @TableField("E_DID")
    private Long eDid;

    @TableField("E_DATE")
    private String eDate;

    @TableField("E_START")
    private String eStart;

    @TableField("E_END")
    private String eEnd;

    @TableField("E_REGION")
    private String eRegion;


    @Override
    protected Serializable pkVal() {
        return this.eId;
    }

    @Override
    public String toString() {
        return "Exchange{" +
        "eId=" + eId +
        ", eDid=" + eDid +
        ", eDate=" + eDate +
        ", eStart=" + eStart +
        ", eEnd=" + eEnd +
        ", eRegion=" + eRegion +
        "}";
    }
}
