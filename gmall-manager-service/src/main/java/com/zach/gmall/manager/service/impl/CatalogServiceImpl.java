package com.zach.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zach.gmall.bean.PmsBaseCatalog1;
import com.zach.gmall.bean.PmsBaseCatalog2;
import com.zach.gmall.bean.PmsBaseCatalog3;
import com.zach.gmall.manager.mapper.PmsBaseCatalog1Mapper;
import com.zach.gmall.manager.mapper.PmsBaseCatalog2Mapper;
import com.zach.gmall.manager.mapper.PmsBaseCatalog3Mapper;
import com.zach.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;
    @Override
    public List<PmsBaseCatalog1> getCatalog1Info() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2Info(String catalog1Id) {
        PmsBaseCatalog2 catalog1 = new PmsBaseCatalog2();
        catalog1.setCatalog1Id(catalog1Id);
        return pmsBaseCatalog2Mapper.select(catalog1);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3Info(String catalog2Id) {
        PmsBaseCatalog3 catalog3 = new PmsBaseCatalog3();
        catalog3.setCatalog2Id(catalog2Id);
        return pmsBaseCatalog3Mapper.select(catalog3);
    }
}
