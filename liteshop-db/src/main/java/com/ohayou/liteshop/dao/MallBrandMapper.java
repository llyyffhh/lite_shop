package com.ohayou.liteshop.dao;

import com.ohayou.liteshop.entity.MallBrand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 品牌分类表 Mapper 接口
 * </p>
 *
 * @author ohayou
 * @since 2020-07-18
 */
public interface MallBrandMapper extends BaseMapper<MallBrand> {

    MallBrand getBrandByCouponId(Long couponId);
}
