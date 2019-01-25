package com.itheima.service.serviceimpl;

import com.itheima.dao.itemsDao;
import com.itheima.domain.items;
import com.itheima.service.itemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class itemsserviceimpl implements itemsService {

    @Autowired
    public itemsDao itemsDao;

    @Override
    public List<items> findItems(Integer id) {
        List<items> items = itemsDao.findItems(id);
        return items;
    }
}
