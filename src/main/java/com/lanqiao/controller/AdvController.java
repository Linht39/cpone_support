package com.lanqiao.controller;

import com.lanqiao.bean.AdvAndCategory;
import com.lanqiao.bean.Advertisement;
import com.lanqiao.service.IAdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther Linht
 * @date 2018/9/14 19:23
 */
@RestController
@RequestMapping("advs")
public class AdvController {

    @Autowired
    IAdvService advService;

    @GetMapping("")
    public List<AdvAndCategory> getAllAdv(){
        return advService.getAllAdv();
    }

    @GetMapping("page")
    public List<AdvAndCategory> getAllAdvByPage(){
        return advService.getAllAdvByPage();
    }

    @GetMapping("{advId}")
    public AdvAndCategory getAdvById(@PathVariable int advId){
        return advService.getAdvById(advId);
    }

    @GetMapping("category/{categoryId}")
    public List<AdvAndCategory> getAdvByCategoryId(@PathVariable int categoryId){
        return advService.getAdvByCategoryId(categoryId);
    }

    @DeleteMapping("{advId}")
    public int delAdvById(@PathVariable int advId){
        return advService.delAdvById(advId);
    }

    @PostMapping("")
    public int insertAdv(Advertisement advertisement){
        return advService.insertAdv(advertisement);
    }

    @PutMapping("")
    public int updateAdv(Advertisement advertisement){
        return advService.updateAdv(advertisement);
    }
}
