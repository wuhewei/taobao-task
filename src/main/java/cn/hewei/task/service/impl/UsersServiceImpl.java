package cn.hewei.task.service.impl;

import cn.hewei.task.entity.Users;
import cn.hewei.task.mapper.UsersMapper;
import cn.hewei.task.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
