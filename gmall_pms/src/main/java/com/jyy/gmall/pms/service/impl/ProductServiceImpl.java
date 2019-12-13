package com.jyy.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyy.gmall.pms.entity.Product;
import com.jyy.gmall.pms.mapper.ProductMapper;
import com.jyy.gmall.pms.service.ProductService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author jyy
 * @since 2019-12-11
 */

/**
 * Service   注解，配置dubbo服务暴露
 * Component 注解，配置spring组件扫描
 */
    @Service
    @Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
