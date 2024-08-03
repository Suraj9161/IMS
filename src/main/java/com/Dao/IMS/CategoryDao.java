package com.Dao.IMS;

import com.entites.IMS.Category;

public class CategoryDao extends AbstractDao<Category, Long> {
    public CategoryDao() {
        super(Category.class);
    }
}

