package com.zheng.cms.web.controller;

import com.zheng.common.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 资讯首页控制器
 * Created by shuzheng on 2017/3/26.
 */
@Controller
@RequestMapping(value = "/news")
public class NewsController extends BaseController {

    private static Logger _log = LoggerFactory.getLogger(NewsController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        return thymeleaf("/news/index");
    }

}