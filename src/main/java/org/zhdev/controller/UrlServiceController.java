package org.zhdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhdev.dao.repository.UrlServiceRepository;
import org.zhdev.entity.ServiceUrl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:08 2017/10/25
 * @Modified By :
 */
@Controller
public class UrlServiceController {

    @Autowired
    private UrlServiceRepository repository;

    @RequestMapping(value = "interface-url")
    public @ResponseBody String interfaceUrl(){
        return "Hello World";
    }
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");


    @RequestMapping(value="insert-url")
    public @ResponseBody  String insertUrl(ServiceUrl url){
        Date nowDate = new Date();
        url.setCreateDate(nowDate);
        url.setUpdateDate(nowDate);
        url.setCreateTime(sdf.format(nowDate));
        url.setUpdateTime(sdf.format(nowDate));
        repository.save(url);
        return "insert Success !";
    }

    @RequestMapping(value="findById-url")
    public @ResponseBody  ServiceUrl findById(Long id){
        ServiceUrl serviceUrl = repository.findOne(id);
        return serviceUrl;
    }

    @RequestMapping(value="list-url")
    public @ResponseBody Iterable<ServiceUrl> listUrl(){
        Iterable<ServiceUrl> urlList = repository.list();
        return urlList;
    }

    @RequestMapping(value="update-url")
    public @ResponseBody Map<String,String> editUrl(ServiceUrl url){
        int code = 200;
        String msg = "success";
        try{
            Date nowDate = new Date();
            url.setUpdateDate(nowDate);
            url.setUpdateTime(sdf.format(nowDate));
            repository.save(url);
        }catch (Exception e){
            code = 500;
            msg = e.getMessage();
            e.printStackTrace();
        }
        Map<String,String > response = new HashMap<String,String>();
        response.put("code",String.valueOf(code));
        response.put("msg",msg);

        return response;
    }

    @RequestMapping(value="delete-url")
    public @ResponseBody Map<String,String> deleteUrl(Long id){
        int code = 200;
        String msg = "success";
        try{
            repository.delete(id);
        }catch (Exception e){
            code = 500;
            msg = e.getMessage();
            e.printStackTrace();
        }
        Map<String,String > response = new HashMap<String,String>();
        response.put("code",String.valueOf(code));
        response.put("msg",msg);
        return response;
    }


    @RequestMapping(value="set-upChoice-url")//上升首选
    public @ResponseBody Map<String,String> upFirstChoice(Long id){
        int code = 200;
        String msg = "success";
        try{
            Date nowDate = new Date();
            ServiceUrl firstUrl = repository.findOne(id);
            firstUrl.setUpdateDate(nowDate);
            firstUrl.setUpdateTime(sdf.format(nowDate));
            repository.save(firstUrl);
        }catch (Exception e){
            code = 500;
            msg = e.getMessage();
            e.printStackTrace();
        }
        Map<String,String > response = new HashMap<String,String>();
        response.put("code",String.valueOf(code));
        response.put("msg",msg);

        return response;
    }

}
