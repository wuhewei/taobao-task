package cn.hewei.task.controller;


import cn.hewei.task.dto.R;
import cn.hewei.task.entity.Shop;
import cn.hewei.task.entity.Users;
import cn.hewei.task.service.IUsersService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@RestController
@RequestMapping("/users")
@SuppressWarnings("unchecked")
public class UsersController {

    @Resource
    private IUsersService usersService;

    @RequestMapping("/list")
    public R<List<Users>> list() {
        return R.ok().data(usersService.list());
    }

    @PostMapping("/saveOrUpdate")
    public R<Users> saveOrUpdate(@RequestBody Users users) {
        usersService.saveOrUpdate(users);
        return R.ok().data(users);
    }

    @PostMapping("/delete")
    public R<Void> delete(@RequestParam Integer userId) {
        usersService.removeById(userId);
        return R.ok();
    }

}
