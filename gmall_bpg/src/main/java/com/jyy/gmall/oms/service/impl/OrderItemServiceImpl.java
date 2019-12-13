package com.jyy.gmall.oms.service.impl;

import com.jyy.gmall.oms.entity.OrderItem;
import com.jyy.gmall.oms.mapper.OrderItemMapper;
import com.jyy.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author jyy
 * @since 2019-12-10
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
