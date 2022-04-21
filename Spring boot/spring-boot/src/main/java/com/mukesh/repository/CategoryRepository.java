package com.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.example.model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
