package cn.hewei.task.service.impl;

import cn.hewei.task.entity.TaskDetail;
import cn.hewei.task.dao.TaskDetailDao;
import cn.hewei.task.service.TaskDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务明细表(TaskDetail)表服务实现类
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@Service("taskDetailService")
public class TaskDetailServiceImpl implements TaskDetailService {
    @Resource
    private TaskDetailDao taskDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TaskDetail queryById(Long id) {
        return this.taskDetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskDetail> queryAllByLimit(int offset, int limit) {
        return this.taskDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TaskDetail insert(TaskDetail taskDetail) {
        this.taskDetailDao.insert(taskDetail);
        return taskDetail;
    }

    /**
     * 修改数据
     *
     * @param taskDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TaskDetail update(TaskDetail taskDetail) {
        this.taskDetailDao.update(taskDetail);
        return this.queryById(taskDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.taskDetailDao.deleteById(id) > 0;
    }
}