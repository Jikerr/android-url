package org.zhdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 9:51 2017/10/26
 * @Modified By :
 */

@Controller
public class ForwardController {

   /* @RequestMapping("/")
    public String index() {
        return "login";
    }*/

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }

    @RequestMapping("/")
    public String index(Model model) {
       /* Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);*/
        return "index";
    }

}
