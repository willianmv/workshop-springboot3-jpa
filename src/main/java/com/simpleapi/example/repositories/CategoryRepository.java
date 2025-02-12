package com.simpleapi.example.repositories;

import com.simpleapi.example.entities.Category;
import com.simpleapi.example.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
