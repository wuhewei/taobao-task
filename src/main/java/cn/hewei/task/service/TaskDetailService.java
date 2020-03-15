package cn.hewei.task.service;

import cn.hewei.task.entity.TaskDetail;
import java.util.List;

/**
 * 任务明细表(TaskDetail)表服务接口
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
public interface TaskDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TaskDetail queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TaskDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param taskDetail 实例对象
     * @return 实例对象
     */
    TaskDetail insert(TaskDetail taskDetail);

    /**
     * 修改数据
     *
     * @param taskDetail 实例对象
     * @return 实例对象
     */
    TaskDetail update(TaskDetail taskDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}