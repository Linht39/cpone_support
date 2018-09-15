package com.lanqiao.repository;

import com.lanqiao.bean.AdvCategory;

import java.util.List;

/**
 * @auther Linht
 * @date 2018/9/14 22:24
 */
public interface IAdvCategoryRepository {

    List<AdvCategory> getAllCategory();

    int delCategoryById(int categoryId);

    int insertCategory(AdvCategory advCategory);
}
