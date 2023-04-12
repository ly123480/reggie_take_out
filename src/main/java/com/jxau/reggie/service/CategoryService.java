package com.jxau.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxau.reggie.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
