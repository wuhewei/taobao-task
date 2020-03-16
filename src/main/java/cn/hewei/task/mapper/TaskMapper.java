package cn.hewei.task.mapper;

import cn.hewei.task.entity.Task;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 任务表 Mapper 接口
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Mapper
public interface TaskMapper extends BaseMapper<Task> {

}
