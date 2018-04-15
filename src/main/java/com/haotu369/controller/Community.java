package com.haotu369.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : shenjian
 * @PackageName : com.haotu369.controller
 * @Created : 2018/4/11
 * @Version : V1.0
 * @Des : 选股社区
 */
@Controller
@RequestMapping("/community")
public class Community {

    // 社区首页
    @RequestMapping("/index")
    public String community() {
        return "community_index";
    }

    // 联系我们
    @RequestMapping("/contact")
    public String contact() {
        return "community_contact";
    }

    // 常见问题
    @RequestMapping("/faqs")
    public String faqs() {
        return "community_faqs";
    }

    // 内容列表
    @RequestMapping("/articles")
    public String articles() {
        return "community_articles";
    }
}
