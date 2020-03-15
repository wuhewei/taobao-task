package cn.hewei.task.controller;

import cn.hewei.task.entity.Shop;
import cn.hewei.task.service.ShopService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 店铺表(Shop)表控制层
 *
 * @author hewei
 * @since 2020-03-15 02:32:16
 */
@RestController
@RequestMapping("shop")
public class ShopController {
    /**
     * 服务对象
     */
    @Resource
    private ShopService shopService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Shop selectOne(Long id) {
        return this.shopService.queryById(id);
    }

}