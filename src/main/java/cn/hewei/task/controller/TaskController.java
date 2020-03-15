package cn.hewei.task.controller;

import cn.hewei.task.dto.R;
import cn.hewei.task.entity.Task;
import cn.hewei.task.service.TaskService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 任务表(Task)表控制层
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@RestController
@RequestMapping("task")
@SuppressWarnings("unchecked")
public class TaskController {

    /**
     * 服务对象
     */
    @Resource
    private TaskService taskService;

    @GetMapping("/")
    public R<Task> list(@PathVariable Long id) {
        return R.ok().data(taskService.queryById(id));
    }

    @GetMapping("/{id}")
    public R<Task> get(@PathVariable Long id) {
        return R.ok().data(taskService.queryById(id));
    }

}