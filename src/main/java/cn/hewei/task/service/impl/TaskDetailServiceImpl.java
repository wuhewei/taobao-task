package cn.hewei.task.service.impl;

import cn.hewei.task.entity.TaskDetail;
import cn.hewei.task.mapper.TaskDetailMapper;
import cn.hewei.task.service.ITaskDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务明细表 服务实现类
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Service
public class TaskDetailServiceImpl extends ServiceImpl<TaskDetailMapper, TaskDetail> implements ITaskDetailService {

}
