package cn.hewei.task.service.impl;

import cn.hewei.task.entity.Task;
import cn.hewei.task.mapper.TaskMapper;
import cn.hewei.task.service.ITaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务表 服务实现类
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {

}
