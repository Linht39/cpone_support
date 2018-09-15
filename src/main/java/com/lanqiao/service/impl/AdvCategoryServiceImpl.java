package com.lanqiao.service.impl;

import com.lanqiao.bean.AdvCategory;
import com.lanqiao.repository.IAdvCategoryRepository;
import com.lanqiao.service.IAdvCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther Linht
 * @date 2018/9/14 22:26
 */
@Service
public class AdvCategoryServiceImpl implements IAdvCategoryService {

    @Autowired
    IAdvCategoryRepository advCategoryRepository;

    @Override
    public List<AdvCategory> getAllCategory() {
        return advCategoryRepository.getAllCategory();
    }

    @Override
    public int delCategoryById(int categoryId) {
        return advCategoryRepository.delCategoryById(categoryId);
    }

    @Override
    public int insertCategory(AdvCategory advCategory) {
        return advCategoryRepository.insertCategory(advCategory);
    }


}
