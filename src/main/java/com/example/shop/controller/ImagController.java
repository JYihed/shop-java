package com.example.shop.controller;

import com.example.shop.service.ImagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author chengjy
 * @date 2023-09-10
 */

@CrossOrigin
@RestController
public class ImagController {

    @Autowired
    ImagService imagService;

    public String ad = "src/main/resources/static";
    //前端主页轮播图1
    @GetMapping("/shop/simag1")
    public ResponseEntity<byte[]> simag1()throws Exception{
        return imagService.tradpic(ad+"/picture/02.jpg");
    }

    //前端主页轮播图2
    @GetMapping("/shop/simag2")
    public ResponseEntity<byte[]> simag2()throws Exception{
        return imagService.tradpic(ad+"/picture/04.jpg");
    }
    //前端主页轮播图3
    @GetMapping("/shop/simag3")
    public ResponseEntity<byte[]> simag3()throws Exception{
        return imagService.tradpic(ad+"/picture/03.jpg");
    }

    //前端主页楼层区
    @GetMapping("/shop/ftitle")
    public ResponseEntity<byte[]> ftitle()throws Exception{
        return imagService.tradpic(ad+"/floor/title/title.jpeg");
    }
    @GetMapping("/shop/fimag1")
    public ResponseEntity<byte[]> fimag1()throws Exception{
        return imagService.tradpic(ad+"/floor/e.jpg");
    }
    @GetMapping("/shop/fimag2")
    public ResponseEntity<byte[]> fimag2()throws Exception{
        return imagService.tradpic(ad+"/floor/t.jpg");
    }




    //商品图片区（祛湿茶）
    @GetMapping("/goods/imag1")
    public ResponseEntity<byte[]> timag1()throws Exception{
        return imagService.tradpic(ad+"/goods/tea/01.jpg");
    }
    @GetMapping("/goods/imag2")
    public ResponseEntity<byte[]> timag2()throws Exception{
        return imagService.tradpic(ad+"/goods/tea/02.jpg");
    }
    @GetMapping("/goods/imag3")
    public ResponseEntity<byte[]> timag3()throws Exception{
        return imagService.tradpic(ad+"/goods/tea/03.jpg");
    }

    //商品图片区（阿胶糕）
    @GetMapping("/goods/imag4")
    public ResponseEntity<byte[]> eimag1()throws Exception{
        return imagService.tradpic(ad+"/goods/ejiao/01.jpg");
    }

    @GetMapping("/goods/imag5")
    public ResponseEntity<byte[]>eimag2()throws Exception{
        return imagService.tradpic(ad+"/goods/ejiao/03.jpg");
    }

    @GetMapping("/goods/imag6")
    public ResponseEntity<byte[]> eimag3()throws Exception{
        return imagService.tradpic(ad+"/goods/ejiao/04.jpg");
    }

    //图片介绍

    //阿胶糕
    @GetMapping("/detail/ejiao/01")
    public ResponseEntity<byte[]> detail01()throws Exception{
        return imagService.tradpic(ad+"/goods/ejiao/11.jpg");
    }
    @GetMapping("/detail/ejiao/02")
    public ResponseEntity<byte[]> detail02()throws Exception{
        return imagService.tradpic(ad+"/goods/ejiao/12.jpg");
    }
    @GetMapping("/detail/ejiao/03")
    public ResponseEntity<byte[]> detail03()throws Exception{
        return imagService.tradpic(ad+"/goods/ejiao/13.jpg");
    }

    //祛湿茶
    @GetMapping("/detail/tea/01")
    public ResponseEntity<byte[]> detail04()throws Exception{
        return imagService.tradpic(ad+"/goods/tea/11.jpg");
    }
    @GetMapping("/detail/tea/02")
    public ResponseEntity<byte[]> detail05()throws Exception{
        return imagService.tradpic(ad+"/goods/tea/12.jpg");
    }
    @GetMapping("/detail/tea/03")
    public ResponseEntity<byte[]> detail06()throws Exception{
        return imagService.tradpic(ad+"/goods/tea/13.jpg");
    }


}
