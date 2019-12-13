package com.jyy.gmall.ums.service;

import com.jyy.gmall.ums.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author jyy
 * @since 2019-12-11
 */
public interface AdminService extends IService<Admin> {
    //登陆
    Admin login(String username, String password);

}
