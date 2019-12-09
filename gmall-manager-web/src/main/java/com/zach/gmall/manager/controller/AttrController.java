package com.zach.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zach.gmall.bean.PmsBaseAttrInfo;
import com.zach.gmall.bean.PmsBaseAttrValue;
import com.zach.gmall.bean.PmsBaseCatalog3;
import com.zach.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;
    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id) {
        List<PmsBaseAttrInfo> catalog3s = attrService.getAttrInfoList(catalog3Id);
        return catalog3s;
    }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {
        String success = attrService.saveAttrInfo(pmsBaseAttrInfo);
        return "success";
    }
    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        List<PmsBaseAttrValue> pmsBaseAttrValues = attrService.getAttrValueList(attrId);
        return pmsBaseAttrValues;
    }
}
