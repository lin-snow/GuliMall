package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author linsnow
 * @email l1nsn0w@qq.com
 * @date 2025-05-05 17:42:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
