package com.lanqiao.repository;

import com.lanqiao.bean.AdvAndCategory;
import com.lanqiao.bean.Advertisement;

import java.util.List;

/**
 * @auther Linht
 * @date 2018/9/14 19:03
 */
public interface IAdvRepository {

    List<AdvAndCategory> getAllAdv();

    List<AdvAndCategory> getAllAdvByPage();

    AdvAndCategory getAdvById(int advId);

    List<AdvAndCategory> getAdvByCategoryId(int categoryId);

    int delAdvById(int advId);

    int insertAdv(Advertisement advertisement);

    int updateAdv(Advertisement advertisement);
}
