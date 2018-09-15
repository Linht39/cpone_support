package com.lanqiao.service;

import com.lanqiao.bean.AdvCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther Linht
 * @date 2018/9/14 22:26
 */
@Transactional
public interface IAdvCategoryService {

    List<AdvCategory> getAllCategory();

    int delCategoryById(int categoryId);

    int insertCategory(AdvCategory advCategory);
}
