package com.yixun.yixun_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigInteger;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import lombok.Data;

/**
 * 
 * @TableName yixun_administrators
 */
@TableName(value ="yixun_administrators")
@Data
public class Administrators implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer administratorId;

    /**
     * 姓名
     */
    private String administratorName;

    /**
     * 手机号
     */
    private Long administratorPhone;

    /**
     * 密码
     */
    private String administratorCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}