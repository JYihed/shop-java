package com.example.shop.service;

import com.example.shop.mapper.GoodsMapper;
import com.example.shop.pojo.Detail;
import com.example.shop.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chengjy
 * @date 2023-09-13
 */

@Service
public class GoodsService {

    @Autowired
    GoodsMapper goodsMapper;
    public String ad="http://127.0.0.1/goods/imag";
    public String ad2="http://127.0.0.1/detail";

    //在数据库中查出所有商品信息
    public List<Goods> FindAllGoods(){
        return goodsMapper.FindAllGoods();
    }


    //根据商品id在数据库中查出商品信息
    public Goods FindGoodsById(Integer id){
        return goodsMapper.FindGoodsById(id);
    }

    //打包商品数据并上传
    public int GetAllTea(){
        Goods tea=new Goods(2,"tea",ad+"1",ad+"2",ad+"3",108,999);
        return goodsMapper.AddGood(tea);
    }
    public int GetAllEjiao(){
        Goods ejiao=new Goods(1,"ejiao",ad+"4",ad+"5",ad+"6",88,999);
        return goodsMapper.AddGood(ejiao);
    }

    public Detail dd(int id){
        if(id==1){
            return new Detail(1,ad2+"/ejiao/01",ad2+"/ejiao/02",ad2+"/ejiao/03");
        }
        else {
            return new Detail(2,ad2+"/tea/01",ad2+"/tea/02",ad2+"/tea/03");
        }
    }

}
