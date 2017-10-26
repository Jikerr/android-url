package org.zhdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhdev.dao.repository.UrlServiceRepository;
import org.zhdev.entity.ServiceUrl;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhdev.dao.repository.UrlServiceRepository;
import org.zhdev.entity.ServiceUrl;
/**
 * @Author: zh
 * @Description :
 * @Date Created in 9:51 2017/10/26
 * @Modified By :
 */

@Controller
public class ForwardController {

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
