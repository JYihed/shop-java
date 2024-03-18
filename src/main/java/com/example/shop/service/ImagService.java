package com.example.shop.service;

import com.example.shop.pojo.Imag;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImagService {
    //本机ip地址，上传服务器后需要更改
    public String ip="http://127.0.0.1";


    //前端主页轮播图接口方法
    public List<Imag> getpictrue(){
        List<Imag> list =new ArrayList<>();
        Imag imag1=new Imag(1,ip+"/shop/simag1");
        Imag imag2=new Imag(2,ip+"/shop/simag2");
        Imag imag3=new Imag(3,ip+"/shop/simag3");
        list.add(imag1);
        list.add(imag2);
        list.add(imag3);
        return list;
    }

    //将图片转换为输入流
    public byte[]  getBytesByStream(InputStream inputStream){
        byte[] bytes = new byte[1024];
        int b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            while((b = inputStream.read(bytes)) != -1){

                byteArrayOutputStream.write(bytes,0,b);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //将图片传入前端
    public ResponseEntity<byte[]> tradpic(String ads)throws Exception{
        File file=new File(ads);
        InputStream inputStream = new FileInputStream(file);
        byte[] bytesByStream = getBytesByStream(inputStream);
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        return new ResponseEntity<>(bytesByStream,headers, HttpStatus.OK);
    }

    //主页楼层图获取
    public List<Imag> getfloor(){
        List<Imag> list =new ArrayList<>();
        Imag imag1=new Imag(1,ip+"/shop/fimag1");
        Imag imag2=new Imag(2,ip+"/shop/fimag2");
        list.add(imag1);
        list.add(imag2);
        return list;
    }
}
