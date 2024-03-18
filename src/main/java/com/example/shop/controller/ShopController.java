package com.example.shop.controller;

import com.example.shop.pojo.Detail;
import com.example.shop.pojo.Goods;
import com.example.shop.pojo.Imag;
import com.example.shop.service.GoodsService;
import com.example.shop.service.ImagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author chengjy
 * @date 2023-09-10
 */

@CrossOrigin
@RestController
public class ShopController {

    @Autowired
    ImagService imagService;
    @Autowired
    GoodsService goodsService;

    //前端主页轮播图数据获取接口
    @GetMapping("/getimag")
    public List<Imag> getimag(){
        return imagService.getpictrue();
    }

    //前端主页楼层图数据获取接口
    @GetMapping("/getfloor")
    public List<Imag> getfloor(){
        return imagService.getfloor();
    }

    //获取商品信息
    @GetMapping("/goods/getgoods")
    public Goods getgoods(Integer id){
        return goodsService.FindGoodsById(id);
    }

    @GetMapping("/goods/detail")
    public Detail getdetail(Integer id){
        return goodsService.dd(id);
    }



    //测试上传 调用一次即可（当前调用次数：1）
    @GetMapping("/test")
    public String test(){
         goodsService.GetAllTea();
         goodsService.GetAllEjiao();
         return "ok";
    }
}
