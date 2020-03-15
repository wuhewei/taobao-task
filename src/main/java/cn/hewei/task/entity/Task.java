package cn.hewei.task.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 任务表(Task)实体类
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@Data
public class Task implements Serializable {
    private static final long serialVersionUID = 979095498213342630L;
    /**
    * 任务id
    */
    private Long id;
    /**
    * 店铺id
    */
    private Long shopId;
    /**
    * 商品名称
    */
    private String name;
    /**
    * 商品链接
    */
    private String linkurl;
    /**
    * 商品主图链接
    */
    private String photourl;
    /**
    * 展示价
    */
    private Double price;
    /**
    * 优惠券金额
    */
    private Double couponAmount;
    /**
    * 任务状态 0：未完成 1：已完成 -1：已取消
    */
    private Object status;
    /**
    * 任务截止日期
    */
    private Object deadline;
    /**
    * 创建时间
    */
    private Date createdTime;
    /**
    * 更新时间
    */
    private Date updatedTime;
}