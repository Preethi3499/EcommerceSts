package com.edubridge.service;



import java.util.List;

import com.edubridge.Category;


public interface CategoryService {
	
 Category addCategoryToUser(Category category, long idUser);
	
 Category editCategory(Category category, long id);
	
 Category findCategoryById(long id);
	
 void deleteCategory(long id);
	
 List<Category> findAllCategories();
	
 List<Category> findCategoriesForUser(long id);

}
