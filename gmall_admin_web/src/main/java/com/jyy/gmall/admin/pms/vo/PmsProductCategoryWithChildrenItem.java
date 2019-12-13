package com.jyy.gmall.admin.pms.vo;


import com.jyy.gmall.pms.entity.ProductCategory;
import lombok.Data;

import java.util.List;

/**
 */
@Data
public class PmsProductCategoryWithChildrenItem extends ProductCategory {
    private List<ProductCategory> children;

}
