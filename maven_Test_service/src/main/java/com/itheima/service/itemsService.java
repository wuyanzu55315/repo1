package com.itheima.service;

import com.itheima.domain.items;

import java.util.List;

public interface itemsService {

    List<items> findItems(Integer id);
}
