package com.jyy.gmall.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyy.gmall.ums.entity.Admin;
import com.jyy.gmall.ums.mapper.AdminMapper;
import com.jyy.gmall.ums.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author jyy
 * @since 2019-12-11
 */
//@Service
@Component
@com.alibaba.dubbo.config.annotation.Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        //Spring自带的md5工具类
        String digest = DigestUtils.md5DigestAsHex(password.getBytes());

       // AdminMapper baseMapper = getBaseMapper();
        System.out.println("获取的参数为===username=="+username+"password==="+password);
        QueryWrapper<Admin> wrapper = new QueryWrapper<Admin>()
                .eq("username", username)
                .eq("password", digest);
       Admin admin = adminMapper.selectOne(wrapper);
       // Admin admin1 = adminMapper.selectById(3);

        return admin;
    }
}
