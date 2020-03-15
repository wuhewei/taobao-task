package cn.hewei.task.dao;

import cn.hewei.task.entity.TaskDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 任务明细表(TaskDetail)表数据库访问层
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@Mapper
public interface TaskDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TaskDetail queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TaskDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param taskDetail 实例对象
     * @return 对象列表
     */
    List<TaskDetail> queryAll(TaskDetail taskDetail);

    /**
     * 新增数据
     *
     * @param taskDetail 实例对象
     * @return 影响行数
     */
    int insert(TaskDetail taskDetail);

    /**
     * 修改数据
     *
     * @param taskDetail 实例对象
     * @return 影响行数
     */
    int update(TaskDetail taskDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}