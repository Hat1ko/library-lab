package com.hat1ko.library.dbl.categories.repositories;

import com.hat1ko.library.dbl.categories.entities.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends CrudRepository<CategoryEntity, String> {
}
