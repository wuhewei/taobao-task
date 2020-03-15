package cn.hewei.task.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 店铺表(Shop)实体类
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@Data
public class Shop implements Serializable {
    private static final long serialVersionUID = -38379681812996894L;
    /**
    * 店铺id
    */
    private Long id;
    /**
    * 店铺名称
    */
    private String name;
    /**
    * 状态 1：启用 0：禁用
    */
    private Object status;
    /**
    * 创建时间
    */
    private Date createdTime;
    /**
    * 更新时间
    */
    private Date updatedTime;
}