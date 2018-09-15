package com.lanqiao.controller;

import com.lanqiao.bean.AdvCategory;
import com.lanqiao.service.IAdvCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther Linht
 * @date 2018/9/14 22:29
 */
@RestController
@RequestMapping("advCategories")
public class AdvCategoryController {

    @Autowired
    IAdvCategoryService advCategoryService;

    @GetMapping("")
    public List<AdvCategory> getAllCategory() {
        return advCategoryService.getAllCategory();
    }

    @DeleteMapping("{categoryId}")
    public int delCategoryById(@PathVariable int categoryId) {
        return advCategoryService.delCategoryById(categoryId);
    }

    @PostMapping("")
    public int insertCategory(AdvCategory advCategory) {
        return advCategoryService.insertCategory(advCategory);
    }
}
