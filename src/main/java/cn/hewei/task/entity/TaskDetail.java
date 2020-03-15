package cn.hewei.task.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 任务明细表(TaskDetail)实体类
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@Data
public class TaskDetail implements Serializable {
    private static final long serialVersionUID = -21171919557239130L;
    /**
    * 任务明细id
    */
    private Long id;
    /**
    * 任务id
    */
    private Long taskId;
    /**
    * 关键词
    */
    private String keyword;
    /**
    * 关键字使用次数
    */
    private Integer count;
    /**
    * 商品规格 例如：XL
    */
    private String sku;
    /**
    * 下单价
    */
    private Double price;
    /**
    * 创建时间
    */
    private Date createdTime;
    /**
    * 更新时间
    */
    private Date updatedTime;
}