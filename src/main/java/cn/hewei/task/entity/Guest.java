package cn.hewei.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

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
    @TableField("userId")
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