package com.katarina.spring.mapper;

import com.katarina.spring.entity.EntityTemplate;

/**
 * @author : LiuWeidong
 * @date : 2018/8/17.
 */
public interface MapperTemplate {
    /**
     * Query Template
     * @param template Entity
     * @return Entity
     */
    EntityTemplate queryTemplate(EntityTemplate template);
}
