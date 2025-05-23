package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        // BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setName("华为");
        // brandService.save(brandEntity);
        // System.out.println("保存成功...");

        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 14L)).forEach(System.out::println);
    }

}
