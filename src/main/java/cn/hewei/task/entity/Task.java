package cn.hewei.task.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 任务表
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Data
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 店铺id
     */
    @TableField("shopId")
    private Long shopId;

    /**
     * 商品名称
     */
    @TableField("name")
    private String name;

    /**
     * 商品链接
     */
    @TableField("linkUrl")
    private String linkUrl;

    /**
     * 商品主图链接
     */
    @TableField("photoUrl")
    private String photoUrl;

    /**
     * 展示价
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 优惠券金额
     */
    @TableField("coupon_amount")
    private BigDecimal couponAmount;

    /**
     * 任务状态 0：未完成 1：已完成 -1：已取消
     */
    @TableField("status")
    private Integer status;

    /**
     * 任务截止日期
     */
    @TableField("deadline")
    private LocalDate deadline;

    /**
     * 创建时间
     */
    @TableField("created_time")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @TableField("updated_time")
    private LocalDateTime updatedTime;
}
