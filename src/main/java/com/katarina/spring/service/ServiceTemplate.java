package com.katarina.spring.service;

import com.katarina.spring.entity.EntityTemplate;
import com.katarina.spring.mapper.MapperTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : LiuWeidong
 * @date : 2018/8/17.
 */
@Service(value = "serviceTemplate")
public class ServiceTemplate {

    @Autowired
    private MapperTemplate mapperTemplate;

    public EntityTemplate queryTemplate(String username, String password) {
        return mapperTemplate.queryTemplate(new EntityTemplate(username, password));
    }
}
