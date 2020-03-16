package cn.hewei.task.service.impl;

import cn.hewei.task.entity.Guest;
import cn.hewei.task.mapper.GuestMapper;
import cn.hewei.task.service.IGuestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 刷手表 服务实现类
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper, Guest> implements IGuestService {

}
