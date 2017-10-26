package org.zhdev.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhdev.dao.repository.UrlServiceRepository;
import org.zhdev.entity.ServiceUrl;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    public @ResponseBody  String insertUrl(Long id){
        String response = "";
        ServiceUrl serviceUrl = repository.findOne(id);
        if(null==serviceUrl){
            return  "find nothing";
        }
        return serviceUrl.toString();
    }

    @RequestMapping(value="list-url")
    public @ResponseBody Iterable<ServiceUrl> listUrl(){
        Iterable<ServiceUrl> urlList = repository.findAll();
        return urlList;
    }

    @RequestMapping(value="update-url")
    public @ResponseBody String editUrl(ServiceUrl url){
        Date nowDate = new Date();
        url.setUpdateDate(nowDate);
        url.setUpdateTime(sdf.format(nowDate));
        repository.save(url);
        return "edit url success";
    }

    @RequestMapping(value="set-upfirstchoice-url")//上升首选
    public @ResponseBody String upFirstChoice(Long id){
        ServiceUrl firstUrl = repository.findOne(id);
        firstUrl.setId(0L);
        repository.save(firstUrl);
        return "success";
    }

}
