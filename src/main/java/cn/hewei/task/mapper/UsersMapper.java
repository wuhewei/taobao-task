package cn.hewei.task.mapper;

import cn.hewei.task.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}
