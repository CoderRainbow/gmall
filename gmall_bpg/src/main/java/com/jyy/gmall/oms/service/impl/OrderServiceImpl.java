package com.jyy.gmall.oms.service.impl;

import com.jyy.gmall.oms.entity.Order;
import com.jyy.gmall.oms.mapper.OrderMapper;
import com.jyy.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author jyy
 * @since 2019-12-10
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
