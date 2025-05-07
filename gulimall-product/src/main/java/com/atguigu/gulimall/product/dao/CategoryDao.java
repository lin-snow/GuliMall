package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author linsnow
 * @email l1nsn0w@qq.com
 * @date 2025-05-04 14:54:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
