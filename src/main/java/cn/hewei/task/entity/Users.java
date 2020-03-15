package cn.hewei.task.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(Users)实体类
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@Data
public class Users implements Serializable {
    private static final long serialVersionUID = 326917583104744785L;
    /**
    * 用户id
    */
    private Long id;
    /**
    * 用户姓名
    */
    private String name;
    /**
    * 登录账户
    */
    private String username;
    /**
    * 登录密码
    */
    private String password;
    /**
    * 用户类型 1: 管理员 2：业务员
    */
    private Object type;
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