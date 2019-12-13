package com.jyy.gmall.cms;

import com.jyy.gmall.cms.entity.PrefrenceArea;
import com.jyy.gmall.cms.service.PrefrenceAreaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class GmallCmsApplicationTests {
    @Autowired
 PrefrenceAreaService prefrenceAreaService;
    @Test
    void contextLoads() {
        PrefrenceArea byId = prefrenceAreaService.getById(1);
        System.out.println("测试问题：");
    }

}
