package com.zach.gmall.service;

import com.zach.gmall.bean.PmsProductInfo;
import com.zach.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);
}
