package com.jyy.gmall.pms.service.impl;

import com.jyy.gmall.pms.entity.Product;
import com.jyy.gmall.pms.mapper.ProductMapper;
import com.jyy.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author jyy
 * @since 2019-12-11
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
