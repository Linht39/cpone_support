package com.lanqiao.service.impl;

import com.lanqiao.bean.AdvAndCategory;
import com.lanqiao.bean.Advertisement;
import com.lanqiao.repository.IAdvRepository;
import com.lanqiao.service.IAdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther Linht
 * @date 2018/9/14 19:17
 */
@Service
public class AdvServiceImpl implements IAdvService {

    @Autowired
   IAdvRepository advRepository;

    @Override
    public List<AdvAndCategory> getAllAdv() {
        return advRepository.getAllAdv();
    }

    @Override
    public List<AdvAndCategory> getAllAdvByPage() {
        return advRepository.getAllAdvByPage();
    }

    @Override
    public AdvAndCategory getAdvById(int advId) {
        return advRepository.getAdvById(advId);
    }

    @Override
    public List<AdvAndCategory> getAdvByCategoryId(int categoryId) {
        return advRepository.getAdvByCategoryId(categoryId);
    }

    @Override
    public int delAdvById(int advId) {
        return advRepository.delAdvById(advId);
    }

    @Override
    public int insertAdv(Advertisement advertisement) {
        return advRepository.insertAdv(advertisement);
    }

    @Override
    public int updateAdv(Advertisement advertisement) {
        return advRepository.updateAdv(advertisement);
    }
}
