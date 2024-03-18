package com.example.shop.mapper;

import com.example.shop.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author chengjy
 * @date 2023-09-13
 */

@Mapper
public interface GoodsMapper {
    List<Goods> FindAllGoods();

    Goods FindGoodsById(Integer id);

    int AddGood(Goods goods);
}
