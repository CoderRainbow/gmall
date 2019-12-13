package com.jyy.gmall.ums;

import com.jyy.gmall.ums.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallUmsApplicationTests {
    @Autowired
    AdminService adminService;
    @Test
    void contextLoads() {
    }

}
