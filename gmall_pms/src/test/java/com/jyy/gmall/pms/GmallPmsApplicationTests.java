package com.jyy.gmall.pms;

import com.jyy.gmall.pms.entity.Brand;
import com.jyy.gmall.pms.entity.Product;
import com.jyy.gmall.pms.service.BrandService;
import com.jyy.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
//        Product byId = productService.getById(2);
//        System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeee"+byId.getName());
        //测试增、删、改在主库，查在从库
//        Brand brand=new Brand();
//        brand.setName("主库保存一条记录");
//        brandService.save(brand);
//        System.out.println("save success!!");
        Brand byId = brandService.getById(1);
        System.out.println("获取的值为："+byId.getName());
    }

}
