package cn.hewei.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 刷手表
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Data
@TableName("guest")
@EqualsAndHashCode(callSuper = false)
public class Guest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 刷手id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 业务员id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 刷手旺旺号
     */
    @TableField("wangwang")
    private String wangwang;

    /**
     * 刷手微信号
     */
    @TableField("weixin")
    private String weixin;

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
