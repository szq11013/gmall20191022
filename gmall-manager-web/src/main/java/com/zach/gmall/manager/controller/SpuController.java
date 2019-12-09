package com.zach.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zach.gmall.bean.PmsProductInfo;
import com.zach.gmall.bean.PmsProductSaleAttr;
import com.zach.gmall.manager.util.PmsUploadUtil;
import com.zach.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {

    @Reference
    SpuService spuService;




    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo) {

        return "success";
    }


    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile) {
       String imgUrl = PmsUploadUtil.uploadImage(multipartFile);
        return imgUrl;
    }


    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId){

        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrList(spuId);
        return pmsProductSaleAttrs;
    }

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id) {
        List<PmsProductInfo> infos = spuService.spuList(catalog3Id);
        return infos;
    }
}
