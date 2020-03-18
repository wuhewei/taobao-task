package cn.hewei.task.controller;


import cn.hewei.task.dto.R;
import cn.hewei.task.entity.Shop;
import cn.hewei.task.entity.Task;
import cn.hewei.task.service.ITaskService;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 任务表 前端控制器
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@RestController
@RequestMapping("/task")
@SuppressWarnings("unchecked")
public class TaskController {

    @Resource
    private ITaskService taskService;

    @RequestMapping("/list")
    public R<List<Task>> list() {
        return R.ok().data(taskService.list());
    }

    @PostMapping("/saveOrUpdate")
    public R<Task> saveOrUpdate(@RequestBody Task task) {
        taskService.saveOrUpdate(task);
        return R.ok().data(task);
    }

    @PostMapping("/delete")
    public R<Void> delete(@RequestParam Integer taskId) {
        taskService.removeById(taskId);
        return R.ok();
    }

}
