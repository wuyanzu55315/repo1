package com.itheima.dao;

import com.itheima.domain.items;

import java.util.List;

public interface itemsDao {

    List<items> findItems(Integer id);
}
