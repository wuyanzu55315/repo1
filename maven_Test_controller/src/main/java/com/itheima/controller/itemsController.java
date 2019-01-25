package com.itheima.controller;

import com.itheima.domain.items;
import com.itheima.service.itemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class itemsController {

    @Autowired
    public itemsService itemsService;

    @RequestMapping("/findItems")
    public String findItems(Model model){
        List<items> items = itemsService.findItems(1);
        model.addAttribute("item",items.get(0));
        return "itemDetail";
    }
}
