package cn.hewei.task.controller;

import cn.hewei.task.entity.Users;
import cn.hewei.task.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表(Users)表控制层
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Users selectOne(Long id) {
        return this.usersService.queryById(id);
    }

}