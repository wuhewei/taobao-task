package cn.hewei.task.controller;

import cn.hewei.task.entity.TaskDetail;
import cn.hewei.task.service.TaskDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 任务明细表(TaskDetail)表控制层
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@RestController
@RequestMapping("taskDetail")
public class TaskDetailController {
    /**
     * 服务对象
     */
    @Resource
    private TaskDetailService taskDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TaskDetail selectOne(Long id) {
        return this.taskDetailService.queryById(id);
    }

}