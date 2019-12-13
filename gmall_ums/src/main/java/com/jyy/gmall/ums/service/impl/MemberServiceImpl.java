package com.jyy.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyy.gmall.ums.entity.Member;
import com.jyy.gmall.ums.mapper.MemberMapper;
import com.jyy.gmall.ums.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author jyy
 * @since 2019-12-11
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
