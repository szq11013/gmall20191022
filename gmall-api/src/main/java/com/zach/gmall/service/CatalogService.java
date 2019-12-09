package com.zach.gmall.service;

import com.zach.gmall.bean.PmsBaseCatalog1;
import com.zach.gmall.bean.PmsBaseCatalog2;
import com.zach.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1Info();

    List<PmsBaseCatalog2> getCatalog2Info(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3Info(String catalog2Id);
}
