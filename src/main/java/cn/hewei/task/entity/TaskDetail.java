package cn.hewei.task.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 任务明细表
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Data
public class TaskDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务明细id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 任务id
     */
    @TableField("task_id")
    private Long taskId;

    /**
     * 关键词
     */
    @TableField("keyword")
    private String keyword;

    /**
     * 关键字使用次数
     */
    @TableField("count")
    private Integer count;

    /**
     * 商品规格 例如：XL
     */
    @TableField("sku")
    private String sku;

    /**
     * 下单价
     */
    @TableField("price")
    private BigDecimal price;

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
