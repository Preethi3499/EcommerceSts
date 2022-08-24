package com.edubridge.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long>{

}