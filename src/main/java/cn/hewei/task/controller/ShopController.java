package cn.hewei.task.controller;


import cn.hewei.task.dto.R;
import cn.hewei.task.entity.Shop;
import cn.hewei.task.entity.Task;
import cn.hewei.task.service.IShopService;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 店铺表 前端控制器
 * </p>
 *
 * @author hewei
 * @since 2020-03-16
 */
@RestController
@RequestMapping("/shop")
@SuppressWarnings("unchecked")
public class ShopController {

    @Resource
    private IShopService shopService;

    @RequestMapping("/list")
    public R<List<Shop>> list() {
        return R.ok().data(shopService.list());
    }

    @PostMapping("/saveOrUpdate")
    public R<Shop> saveOrUpdate(@RequestBody Shop shop) {
        shopService.saveOrUpdate(shop);
        return R.ok().data(shop);
    }

    @PostMapping("/delete")
    public R<Void> delete(@RequestParam Integer shopId) {
        shopService.removeById(shopId);
        return R.ok();
    }

}
