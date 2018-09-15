package com.lanqiao.service;

import com.lanqiao.bean.AdvAndCategory;
import com.lanqiao.bean.Advertisement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther Linht
 * @date 2018/9/14 19:17
 */
@Transactional
public interface IAdvService {

    List<AdvAndCategory> getAllAdv();

    List<AdvAndCategory> getAllAdvByPage();

    AdvAndCategory getAdvById(int advId);

    List<AdvAndCategory> getAdvByCategoryId(int categoryId);

    int delAdvById(int advId);

    int insertAdv(Advertisement advertisement);

    int updateAdv(Advertisement advertisement);
}
